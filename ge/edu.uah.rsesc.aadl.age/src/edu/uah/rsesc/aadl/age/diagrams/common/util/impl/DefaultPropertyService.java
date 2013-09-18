package edu.uah.rsesc.aadl.age.diagrams.common.util.impl;

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

import edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService;

public class DefaultPropertyService implements PropertyService {
	private static final String TYPE_NAME_KEY = "type";
	private static final String NAME_KEY = "name";
	private static final String SIDE_KEY = "side"; // Which side the shape is on
	private static final String LAYOUT_SIDE_KEY = "layout_side"; // Which side the shape is layed out as
	private static final String SELECTED_MODE_KEY = "selected_mode"; // The name of the mode the user has selected in the UI
	private static final String SELECTED_FLOW_KEY = "selected_flow"; // The name of the flow the user has selected in the UI
	private static final String IS_LAYED_OUT_KEY = "is_layed_out"; // Whether the shape has been layed out by the automatic layout algorithm
	private static final String IS_GHOST_KEY = "is_ghost"; // Whether the pictogram element is a ghost. A ghost is an element that has been hidden because the corresponding business object is no longer valid.
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#getTypeName(org.eclipse.graphiti.mm.pictograms.PictogramElement)
	 */
	@Override
	public final String getTypeName(final PictogramElement pe) {
		return Graphiti.getPeService().getPropertyValue(pe, TYPE_NAME_KEY);
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#setTypeName(org.eclipse.graphiti.mm.pictograms.PictogramElement, java.lang.String)
	 */
	@Override
	public final void setTypeName(final PictogramElement pe, final String typeName) {
		Graphiti.getPeService().setPropertyValue(pe, TYPE_NAME_KEY, typeName);
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#getName(org.eclipse.graphiti.mm.pictograms.PictogramElement)
	 */
	@Override
	public final String getName(final PictogramElement pe) {
		return Graphiti.getPeService().getPropertyValue(pe, NAME_KEY);
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#setName(org.eclipse.graphiti.mm.pictograms.PictogramElement, java.lang.String)
	 */
	@Override
	public final void setName(final PictogramElement pe, final String typeName) {
		Graphiti.getPeService().setPropertyValue(pe, NAME_KEY, typeName);
	}
	
	// Is on the left side of the container. Defaults to true if there isn't a value assigned to the property
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#getIsLeft(org.eclipse.graphiti.mm.pictograms.PictogramElement)
	 */
	@Override
	public final boolean getIsLeft(final PictogramElement pe) {
		return !("right".equals(Graphiti.getPeService().getPropertyValue(pe, SIDE_KEY)));
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#setIsLeft(org.eclipse.graphiti.mm.pictograms.PictogramElement, boolean)
	 */
	@Override
	public final void setIsLeft(final PictogramElement pe, final boolean value) {
		Graphiti.getPeService().setPropertyValue(pe, SIDE_KEY, value ? "left" : "right");
	}
	
	// If it is layed out such that it is on the left side of the layout container. Defaults to true if there isn't a value assigned to the property
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#getIsLeftLayout(org.eclipse.graphiti.mm.pictograms.PictogramElement)
	 */
	@Override
	public final boolean getIsLeftLayout(final PictogramElement pe) {
		return !("right".equals(Graphiti.getPeService().getPropertyValue(pe, LAYOUT_SIDE_KEY)));
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#setIsLeftLayout(org.eclipse.graphiti.mm.pictograms.PictogramElement, boolean)
	 */
	@Override
	public final void setIsLeftLayout(final PictogramElement pe, final boolean value) {
		Graphiti.getPeService().setPropertyValue(pe, LAYOUT_SIDE_KEY, value ? "left" : "right");
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#getSelectedMode(org.eclipse.graphiti.mm.pictograms.Diagram)
	 */
	@Override
	public final String getSelectedMode(final Diagram diagram) {
		final String modeName = Graphiti.getPeService().getPropertyValue(diagram, SELECTED_MODE_KEY);
		return (modeName == null) ? "" : modeName;
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#setSelectedMode(org.eclipse.graphiti.mm.pictograms.Diagram, java.lang.String)
	 */
	@Override
	public final void setSelectedMode(final Diagram diagram, final String modeName) {
		Graphiti.getPeService().setPropertyValue(diagram, SELECTED_MODE_KEY, modeName);
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#getSelectedFlow(org.eclipse.graphiti.mm.pictograms.Diagram)
	 */
	@Override
	public final String getSelectedFlow(final Diagram diagram) {
		final String modeName = Graphiti.getPeService().getPropertyValue(diagram, SELECTED_FLOW_KEY);
		return (modeName == null) ? "" : modeName;
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#setSelectedFlow(org.eclipse.graphiti.mm.pictograms.Diagram, java.lang.String)
	 */
	@Override
	public final void setSelectedFlow(final Diagram diagram, final String flowName) {
		Graphiti.getPeService().setPropertyValue(diagram, SELECTED_FLOW_KEY, flowName);
	}

	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#isLayedOut(org.eclipse.graphiti.mm.pictograms.PictogramElement)
	 */
	@Override
	public final boolean isLayedOut(final PictogramElement pe) {
		return "true".equals(Graphiti.getPeService().getPropertyValue(pe, IS_LAYED_OUT_KEY));
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#setIsLayedOut(org.eclipse.graphiti.mm.pictograms.PictogramElement, boolean)
	 */
	@Override
	public final void setIsLayedOut(final PictogramElement pe, final boolean value) {
		Graphiti.getPeService().setPropertyValue(pe, IS_LAYED_OUT_KEY, value ? "true" : "false");
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#isGhost(org.eclipse.graphiti.mm.pictograms.PictogramElement)
	 */
	@Override
	public final boolean isGhost(final PictogramElement pe) {
		return "true".equals(Graphiti.getPeService().getPropertyValue(pe, IS_GHOST_KEY));
	}
	
	/* (non-Javadoc)
	 * @see edu.uah.rsesc.aadl.age.diagrams.common.util.PropertyService#setIsGhost(org.eclipse.graphiti.mm.pictograms.PictogramElement, boolean)
	 */
	@Override
	public final void setIsGhost(final PictogramElement pe, final boolean value) {
		Graphiti.getPeService().setPropertyValue(pe, IS_GHOST_KEY, value ? "true" : "false");
	}
}
