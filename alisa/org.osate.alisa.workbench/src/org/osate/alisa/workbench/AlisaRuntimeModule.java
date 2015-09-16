/*
 * generated by Xtext
 */
package org.osate.alisa.workbench;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class AlisaRuntimeModule extends org.osate.alisa.workbench.AbstractAlisaRuntimeModule {
// TODO have own copy in workbench since it does not use Common grammar rules. Can change once we remove Xbase dependency
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return org.osate.alisa.workbench.naming.WorkbenchQualifiedNameConverter.class;
	}

	// TODO have own copy in workbench since it does not use Common grammar rules. Can change once we remove Xbase dependency
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return org.osate.alisa.workbench.services.WorkbenchValueConverters.class;
	}

	public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return org.osate.alisa.workbench.generator.AlisaOutputConfigurationProvider.class;
	}

}
