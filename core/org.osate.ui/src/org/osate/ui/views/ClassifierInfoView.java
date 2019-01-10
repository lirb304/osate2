package org.osate.ui.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.osate.aadl2.BehavioredImplementation;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.Connection;
import org.osate.aadl2.EndToEndFlow;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FeatureGroupType;
import org.osate.aadl2.FlowImplementation;
import org.osate.aadl2.FlowSpecification;
import org.osate.aadl2.ModeFeature;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Prototype;
import org.osate.aadl2.Subcomponent;
import org.osate.ui.UiUtil;

public final class ClassifierInfoView extends ViewPart implements ISelectionListener {
	/**
	 * The current selection.
	 */
	private ISelection currentSelection;

	private TreeViewer ancestorTree;
	private TreeViewer memberTree;

	private final ILabelProvider modelElementLabelProvider;
	private Image aadlImage;

//	@Inject
//	private ISerializer serializer;

	public ClassifierInfoView() {
//		final Injector injector = IResourceServiceProvider.Registry.INSTANCE
//				.getResourceServiceProvider(URI.createFileURI("dummy.aadl")).get(Injector.class);
//		injector.injectMembers(this);
		modelElementLabelProvider = UiUtil.getModelElementLabelProvider();
	}

	// ======================================================================
	// == Creation and clean up of all the UI stuff
	// ======================================================================

	@Override
	public void createPartControl(final Composite parent) {
		final SashForm sash = new SashForm(parent, SWT.HORIZONTAL);

		ancestorTree = createAncestorTree(sash);
		memberTree = createMemberTree(sash);
	}

	@Override
	public void init(final IViewSite site) throws PartInitException {
		site.getPage().addPostSelectionListener(this);
		aadlImage = new Image(site.getShell().getDisplay(),
				ClassifierInfoView.class.getResourceAsStream("/icons/aadl.gif"));
		super.init(site);
	}

	@Override
	public void dispose() {
		getSite().getPage().removePostSelectionListener(this);
		aadlImage.dispose();
		aadlImage = null;
		currentSelection = null;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	private TreeViewer createAncestorTree(final Composite parent) {
		final Composite treeComposite = new Composite(parent, SWT.NONE);
		final TreeColumnLayout treeColumnLayout = new TreeColumnLayout();
		treeComposite.setLayout(treeColumnLayout);

		final TreeViewer treeViewer = new TreeViewer(treeComposite, SWT.H_SCROLL | SWT.V_SCROLL);
		treeViewer.getTree().setLinesVisible(false);
		treeViewer.getTree().setHeaderVisible(false);
		treeViewer.getTree().setFont(parent.getFont());

		final TreeViewerColumn treeViewerCol = new TreeViewerColumn(treeViewer, SWT.LEFT);
		treeColumnLayout.setColumnData(treeViewerCol.getColumn(), new ColumnWeightData(1, true));
		treeViewerCol.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public Image getImage(Object element) {
				return ((AncestorTreeNode) element).getImage();
			}

			@Override
			public String getText(final Object element) {
				return ((AncestorTreeNode) element).getText();
			}
		});
		treeViewer.setContentProvider(new ITreeContentProvider() {
			@Override
			public boolean hasChildren(final Object element) {
				return ((AncestorTreeNode) element).hasChildren();
			}

			@Override
			public Object getParent(final Object element) {
				return ((AncestorTreeNode) element).getParent();
			}

			@Override
			public Object[] getElements(final Object inputElement) {
				if (inputElement != null) {
					return ((AncestorTree) inputElement).getChildren();
				} else {
					return new Object[0];
				}
			}

			@Override
			public Object[] getChildren(final Object parentElement) {
				return ((AncestorTreeNode) parentElement).getChildren();
			}
		});

		return treeViewer;
	}

	private TreeViewer createMemberTree(final Composite parent) {
		final Composite treeComposite = new Composite(parent, SWT.NONE);
		final TreeColumnLayout treeColumnLayout = new TreeColumnLayout();
		treeComposite.setLayout(treeColumnLayout);

		final TreeViewer treeViewer = new TreeViewer(treeComposite, SWT.H_SCROLL | SWT.V_SCROLL);
		treeViewer.getTree().setLinesVisible(false);
		treeViewer.getTree().setHeaderVisible(false);
		treeViewer.getTree().setFont(parent.getFont());

		final TreeViewerColumn treeViewerCol = new TreeViewerColumn(treeViewer, SWT.LEFT);
		treeColumnLayout.setColumnData(treeViewerCol.getColumn(), new ColumnWeightData(1, true));
		treeViewerCol.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public Image getImage(Object element) {
				return ((MemberTreeNode) element).getImage();
			}

			@Override
			public String getText(final Object element) {
				return ((MemberTreeNode) element).getText();
			}
		});
		treeViewer.setContentProvider(new ITreeContentProvider() {
			@Override
			public boolean hasChildren(final Object element) {
				return ((MemberTreeNode) element).hasChildren();
			}

			@Override
			public Object getParent(final Object element) {
				return null;
			}

			@Override
			public Object[] getElements(final Object inputElement) {
				if (inputElement != null) {
					return ((MemberTree) inputElement).getSections();
				} else {
					return new Object[0];
				}
			}

			@Override
			public Object[] getChildren(final Object parentElement) {
				return ((MemberTreeNode) parentElement).getChildren();
			}
		});

		return treeViewer;
	}

	// ======================================================================
	// == Listeners
	// ======================================================================

	@Override
	public void selectionChanged(final IWorkbenchPart part, final ISelection selection) {
		if (part == null || selection == null | selection.equals(currentSelection)) {
			return;
		}

		currentSelection = selection;

		Classifier input = null;
		if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
			final Object selectedObject = ((IStructuredSelection) selection).getFirstElement();
			if (selectedObject != null && selectedObject instanceof Classifier) {
				input = (Classifier) selectedObject;
			}
		}

		if (input != null) {
			ancestorTree.setInput(createAncestorTree(input));
			ancestorTree.expandToLevel(2);
			if (input instanceof ComponentType) {
				memberTree.setInput(createMemberTree((ComponentType) input));
				memberTree.expandToLevel(2);
			} else if (input instanceof ComponentImplementation) {
				memberTree.setInput(createMemberTree((ComponentImplementation) input));
				memberTree.expandToLevel(2);
			} else if (input instanceof FeatureGroupType) {
				memberTree.setInput(createMemberTree((FeatureGroupType) input));
				memberTree.expandToLevel(2);
			}
		}
	}

	// ======================================================================
	// == Helper classes
	// ======================================================================

	// ----------------------------------------------------------------------
	// -- Ancestor tree
	// ----------------------------------------------------------------------

	private final class AncestorTree {
		private final AncestorTreeNode[] children;

		private AncestorTree(final AncestorTreeNode root) {
			children = new AncestorTreeNode[] { root };
		}

		public AncestorTreeNode[] getChildren() {
			return children;
		}
	}

	private AncestorTree createAncestorTree(final Classifier classifier) {
		return new AncestorTree(createAncestorTreeNode(classifier, ""));
	}

	private final class AncestorTreeNode {
		protected final Classifier classifier;
		private final String prefix;
		private AncestorTreeNode parent;
		private AncestorTreeNode[] children;

		private AncestorTreeNode(final Classifier classifier, final String prefix, final AncestorTreeNode[] children) {
			this.classifier = classifier;
			this.prefix = prefix;
			this.children = children;
			for (final AncestorTreeNode child : children) {
				child.setParent(this);
			}
		}

		public Image getImage() {
			return modelElementLabelProvider.getImage(classifier);
		}

		public String getText() {
			return prefix + modelElementLabelProvider.getText(classifier);
		}

		public final boolean hasChildren() {
			return children.length > 0;
		}

		public final AncestorTreeNode[] getChildren() {
			return children;
		}

		public final AncestorTreeNode getParent() {
			return parent;
		}

		final void setParent(final AncestorTreeNode parent) {
			this.parent = parent;
		}
	}

	private AncestorTreeNode createAncestorTreeNode(final Classifier classifier, final String prefix) {
		AncestorTreeNode[] children = new AncestorTreeNode[0];
		if (classifier instanceof ComponentType) {
			final ComponentType extended = ((ComponentType) classifier.getExtended());
			if (extended != null) {
				children = new AncestorTreeNode[] { createAncestorTreeNode(extended, "extends ") };
			}
		} else if (classifier instanceof ComponentImplementation) {
			final ComponentImplementation asCompImpl = (ComponentImplementation) classifier;
			final ComponentType implemented = asCompImpl.getType();
			final ComponentImplementation extended = asCompImpl.getExtended();
			if (extended == null) {
				children = new AncestorTreeNode[] { createAncestorTreeNode(implemented, "implements ") };
			} else {
				children = new AncestorTreeNode[] { createAncestorTreeNode(implemented, "implements "),
						createAncestorTreeNode(extended, "extends ") };
			}
		} else if (classifier instanceof FeatureGroupType) {
			final FeatureGroupType asFeatureGroup = (FeatureGroupType) classifier;
			final FeatureGroupType inverseOf = asFeatureGroup.getInverse();
			final FeatureGroupType extended = asFeatureGroup.getExtended();
			final List<AncestorTreeNode> childrenList = new ArrayList<>(2);
			if (inverseOf != null) {
				childrenList.add(createAncestorTreeNode(inverseOf, "inverse of "));
			}
			if (extended != null) {
				childrenList.add(createAncestorTreeNode(extended, "extends "));
			}
			children = childrenList.toArray(children);
		}
		return new AncestorTreeNode(classifier, prefix, children);
	}

	// ----------------------------------------------------------------------
	// -- Member tree
	// ----------------------------------------------------------------------

	private final static class MemberTree {
		private final SectionNode[] sections;

		private MemberTree(List<SectionNode> sectionsList) {
			sections = sectionsList.toArray(new SectionNode[sectionsList.size()]);
		}

		public SectionNode[] getSections() {
			return sections;
		}
	}

	private MemberTree createMemberTree(final FeatureGroupType fgt) {
		final List<SectionNode> sections = new ArrayList<>();
		addSection(sections, "Prototypes", fgt, fgt.getAllPrototypes(), ClassifierInfoView::getRefinedPrototype);
		final EList<Feature> allFeatures = fgt.getAllFeatures();
		addFeatureGroupFeaturesSection(sections, fgt, allFeatures);
		return new MemberTree(sections);
	}

	private MemberTree createMemberTree(final ComponentType ct) {
		final List<SectionNode> sections = new ArrayList<>();
		addSection(sections, "Prototypes", ct, ct.getAllPrototypes(), ClassifierInfoView::getRefinedPrototype);
		addSection(sections, "Features", ct, ct.getAllFeatures(), ClassifierInfoView::getRefinedFeature);
		addSection(sections, "Flows", ct, ct.getAllFlowSpecifications(), ClassifierInfoView::getRefinedFlowSpec);
		addSection(sections, "Modes", ct, getAllModesAndModeTransitions(ct), ClassifierInfoView::cannotBeRefined);
		return new MemberTree(sections);
	}

	private MemberTree createMemberTree(final ComponentImplementation ci) {
		final List<SectionNode> sections = new ArrayList<>();
		addSection(sections, "Prototypes", ci, ci.getAllPrototypes(), ClassifierInfoView::getRefinedPrototype);
		addSection(sections, "Features", ci, ci.getType().getAllFeatures(), ClassifierInfoView::getRefinedFeature);
		addSection(sections, "Subcomponents", ci, ci.getAllSubcomponents(), ClassifierInfoView::getRefinedSubcomponent);
		addSection(sections, "Internal features", ci, ci.getAllInternalFeatures(), ClassifierInfoView::cannotBeRefined);
		addSection(sections, "Processor features", ci, ci.getAllProcessorFeatures(),
				ClassifierInfoView::cannotBeRefined);
		if (ci instanceof BehavioredImplementation) {
			addSection(sections, "Calls", ci, ((BehavioredImplementation) ci).getAllSubprogramCallSequences(),
					ClassifierInfoView::cannotBeRefined);
		}
		addSection(sections, "Connections", ci, ci.getAllConnections(), ClassifierInfoView::getRefinedConnection);
		addFlowImplementationSection(sections, ci);
		addSection(sections, "Modes", ci, getAllModesAndModeTransitions(ci), ClassifierInfoView::cannotBeRefined);
		return new MemberTree(sections);
	}

	private <M extends NamedElement> void addSection(final List<SectionNode> sections, final String heading,
			final Classifier classifier, final List<M> members, final GetRefined<M> gr) {
		if (members != null && members.size() > 0) {
			sections.add(createSectionNode(classifier, members, heading, gr));
		}
	}

	private void addFeatureGroupFeaturesSection(final List<SectionNode> sections, final FeatureGroupType fgt,
			final List<Feature> members) {
		if (members != null && members.size() > 0) {
			sections.add(createFeatureGroupFeaturesSectionNode(fgt, members));
		}
	}

	private void addFlowImplementationSection(final List<SectionNode> sections, final ComponentImplementation ci) {
		List<FlowImplementation> flowImpls = ci.getAllFlowImplementations();
		if (flowImpls == null) {
			flowImpls = Collections.emptyList();
		}
		List<EndToEndFlow> end2endFlows = ci.getAllEndToEndFlows();
		if (end2endFlows == null) {
			end2endFlows = Collections.emptyList();
		}
		if (!flowImpls.isEmpty() || !end2endFlows.isEmpty()) {
			sections.add(createSectionFromFlowImplementations(ci, flowImpls, end2endFlows));
		}
	}

	private static interface MemberTreeNode {
		public String getText();

		public Image getImage();
		public boolean hasChildren();
		public Object[] getChildren();
	}

	private final class SectionNode implements MemberTreeNode {
		private final String heading;
		private final MemberNode[] members;

		private SectionNode(final String heading, List<MemberNode> membersList) {
			this.heading = heading;
			this.members = membersList.toArray(new MemberNode[membersList.size()]);
		}

		@Override
		public String getText() {
			return heading;
		}

		@Override
		public Image getImage() {
			return aadlImage;
		}

		@Override
		public boolean hasChildren() {
			return members.length > 0;
		}

		@Override
		public MemberNode[] getChildren() {
			return members;
		}
	}

	public <M extends NamedElement> SectionNode createSectionNode(final Classifier classifier, final List<M> members,
			final String heading, final GetRefined<M> gr) {
		Collections.sort(members, MEMBER_COMPARATOR);
		final List<MemberNode> memberNodes = new ArrayList<>();
		for (final M member : members) {
			memberNodes.add(createMemberNode(classifier, member, gr));
		}
		return new SectionNode(heading, memberNodes);
	}

	public SectionNode createFeatureGroupFeaturesSectionNode(final FeatureGroupType fgt, final List<Feature> members) {
		final boolean isInverted = (fgt.getInverse() != null) && fgt.getOwnedFeatures().isEmpty();
		Collections.sort(members, MEMBER_COMPARATOR);
		final List<MemberNode> memberNodes = new ArrayList<>();
		for (final Feature member : members) {
			memberNodes.add(createMemberNode(fgt, isInverted, member, ClassifierInfoView::getRefinedFeature));
		}
		return new SectionNode("Features", memberNodes);
	}

	public SectionNode createSectionFromFlowImplementations(final ComponentImplementation ci,
			List<FlowImplementation> flowImpls, List<EndToEndFlow> end2endFlows) {
		final List<MemberNode> memberNodes = new ArrayList<>();

		Collections.sort(flowImpls, MEMBER_COMPARATOR);
		for (final FlowImplementation flowImpl : flowImpls) {
			memberNodes.add(createMemberNodeFromFlowImplementation(ci, flowImpl));
		}

		Collections.sort(end2endFlows, MEMBER_COMPARATOR);
		for (final EndToEndFlow e2e : end2endFlows) {
			memberNodes.add(createMemberNode(ci, e2e, ClassifierInfoView::getRefinedEndToEndFlow));
		}
		return new SectionNode("Flows", memberNodes);
	}

	private final class MemberNode implements MemberTreeNode {
		private final EObject member;
		private final String name;
		private final Classifier inheritedFrom;
		private final boolean isInverted;
		private final boolean isRefined;
		private final MemberNode[] ancestorMember;

		private MemberNode(final EObject m, final String n, final Classifier from, final boolean inverted,
				final boolean refined,
				final MemberNode ancestor) {
			member = m;
			name = n;
			inheritedFrom = from;
			isInverted = inverted;
			isRefined = refined;
			ancestorMember = ancestor == null ? new MemberNode[0] : new MemberNode[] { ancestor };
		}

		private MemberNode(final EObject m, final String n, final Classifier from, final boolean refined,
				final MemberNode ancestor) {
			this(m, n, from, false, refined, ancestor);
		}

		@Override
		public String getText() {
			return (isInverted ? "inverse of " : "") + (isRefined ? "refined " : "") + unparseMember(member, name)
					+ (inheritedFrom != null ? (" [from " + inheritedFrom.getName() + "]") : "");
		}

		@Override
		public Image getImage() {
			return modelElementLabelProvider.getImage(member);
		}

		@Override
		public boolean hasChildren() {
			return ancestorMember.length > 0;
		}

		@Override
		public MemberNode[] getChildren() {
			return ancestorMember;
		}

		private String unparseMember(final EObject member, final String name) {
//			if (member instanceof Feature) {
//				final Feature feature = (Feature) member;
//				final StringBuilder sb = new StringBuilder();
//				sb.append(serializer.serialize(member));
//				return sb.toString();
//			} else {
				return name;
//			}
		}
	}

	public <M extends NamedElement> MemberNode createMemberNode(final Classifier classifier, final M member,
			final GetRefined<M> gr) {
		final Classifier q = (Classifier) member.eContainer();
		final boolean isLocal = q.equals(classifier);
		final M refined = gr.getRefined(member);
		final boolean isRefined = refined != null;
		return new MemberNode(member, member.getName(),
				isLocal ? null : q, isRefined,
				!isRefined ? null : createMemberNode(classifier, refined, gr));
	}

	public <M extends NamedElement> MemberNode createMemberNode(final FeatureGroupType fgt, final boolean isInverted,
			final M member, final GetRefined<M> gr) {
		final Classifier q = (Classifier) member.eContainer();
		final boolean isLocal = q.equals(fgt);
		final M refined = gr.getRefined(member);
		final boolean isRefined = refined != null;
		return new MemberNode(member, member.getName(), isLocal ? null : q, isInverted, isRefined,
				!isRefined ? null : createMemberNode(fgt, isInverted, refined, gr));
	}

	public MemberNode createMemberNodeFromFlowImplementation(final ComponentImplementation ci, final FlowImplementation flowImpl) {
		final Classifier q = (Classifier) flowImpl.eContainer();
		final boolean isLocal = q.equals(ci);
		final FlowSpecification flowSpec = flowImpl.getSpecification();
		return new MemberNode(flowImpl, flowSpec.getName(), isLocal ? null : q, false,
				createMemberNode(ci, flowSpec, ClassifierInfoView::getRefinedFlowSpec));
	}

	private static final List<ModeFeature> getAllModesAndModeTransitions(final ComponentType ct) {
		final List<ModeFeature> modeFeatures = new ArrayList<>();
		modeFeatures.addAll(ct.getAllModes());
		modeFeatures.addAll(ct.getAllModeTransitions());
		return modeFeatures;
	}

	private static final List<ModeFeature> getAllModesAndModeTransitions(final ComponentImplementation ci) {
		final List<ModeFeature> modeFeatures = new ArrayList<>();
		modeFeatures.addAll(ci.getAllModes());
		modeFeatures.addAll(ci.getAllModeTransitions());
		return modeFeatures;
	}

	private static final Comparator<NamedElement> MEMBER_COMPARATOR = new MemberComparator();

	private static final class MemberComparator implements Comparator<NamedElement> {
		@Override
		public int compare(final NamedElement o1, final NamedElement o2) {
			return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
		}
	}

	@FunctionalInterface
	private static interface GetRefined<M extends NamedElement> {
		public M getRefined(M member);
	}

	private static <X extends NamedElement> X cannotBeRefined(final X x) {
		// cannot be refined
		return null;
	}

	private static Prototype getRefinedPrototype(final Prototype p) {
		return p.getRefined();
	}

	private static Feature getRefinedFeature(final Feature f) {
		return f.getRefined();
	}

	private static FlowSpecification getRefinedFlowSpec(final FlowSpecification fs) {
		return fs.getRefined();
	}

	private static Subcomponent getRefinedSubcomponent(final Subcomponent sub) {
		return sub.getRefined();
	}

	private static Connection getRefinedConnection(final Connection c) {
		return c.getRefined();
	}

	private static EndToEndFlow getRefinedEndToEndFlow(final EndToEndFlow e) {
		return e.getRefined();
	}
}
