package org.osate.standalone.emf;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.osate.aadl2.Property;
import org.osate.aadl2.instance.InstancePackage;
import org.osate.aadl2.util.Aadl2ResourceFactoryImpl;
import org.osate.pluginsupport.PluginSupportUtil;
import org.osate.xtext.aadl2.Aadl2StandaloneSetup;

import com.google.inject.Injector;

public final class LoadDeclarativeModelAndContributedProperties_extensions {
	public static void main(String[] args) {
		// Init AADL meta model
		final Injector injector = new Aadl2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("aaxl2", new Aadl2ResourceFactoryImpl());
		InstancePackage.eINSTANCE.eClass();

//		// URI mapping for loading files this defines the "workspace" needed to resolve relative references
//		String wsRoot = Paths.get(".").toAbsolutePath().normalize().toString();
//		EcorePlugin.getPlatformResourceMap().put("foo", URI.createFileURI(wsRoot + "/aadl_files/"));

		final XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);

		// Add contributed resources

		// Find from extensions
		EcorePlugin.ExtensionProcessor.process(Thread.currentThread().getContextClassLoader());
		final List<URI> contributed = PluginSupportUtil.getContributedAadl();
		System.out.println("Found contributed files...");
		for (final URI uri : contributed) {
			System.out.println("..." + uri.toString());
		}

		// Load the contributed resources and map their URIs for name resolution
		System.out.println();
		System.out.println("Loading...");
		final Map<URI, URI> uriMap = rs.getURIConverter().getURIMap();
		for (final URI uri : contributed) {
			System.out.println("..." + uri.toString());
			rs.getResource(uri, true);
//			System.out
//					.println("Mapping " + uri + " to " + URI.createPlatformResourceURI(uri.path().substring(7), false));
//			uriMap.put(uri, URI.createPlatformResourceURI(uri.path().substring(7), false));
		}

//		for (int i = 0; i < args.length; i++) {
//			res = rs.getResource(URI.createPlatformResourceURI(args[i], true), true);
//			System.out.println("..." + res.getURI());
//		}

		System.out.println();
		for (final Resource resource : rs.getResources()) {
			System.out.println("Validating " + resource.getURI() + "...");
			if (resource instanceof XtextResource) {
				// Validate AADL model
				IResourceValidator validator = ((XtextResource) resource).getResourceServiceProvider()
						.getResourceValidator();
				List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
				for (Issue issue : issues) {
					System.err.println(issue.getMessage());
				}
			} else {
				// Resolve links -- AAXL model?
				EcoreUtil.resolveAll(resource);
				for (Diagnostic diag : resource.getErrors()) {
					System.err.println(diag.getMessage());
				}
			}
		}

		System.out.println();
		System.out.println("Traversing...");
		for (final Resource resource : rs.getResources()) {
			System.out.println("*** " + resource.getURI().toString() + " ***");
			final TreeIterator<EObject> treeIter = resource.getAllContents();
			while (treeIter.hasNext()) {
				final EObject next = treeIter.next();
				if (next instanceof Property && ((Property) next).getName().equalsIgnoreCase("Partition_Latency")) {
					System.out.println("p");
				}
				System.out.println(next);
			}
			System.out.println("-- -- -- -- -- -- -- --");
		}
	}
}
