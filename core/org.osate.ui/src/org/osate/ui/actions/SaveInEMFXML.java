/*
 * Created on Jan 30, 2004
 *
 * <copyright>
 * Copyright  2004 by Carnegie Mellon University, all rights reserved.
 *
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
 * NO WARRANTY
 *
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE "DELIVERABLES") ARE ON AN "AS-IS" BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE OF THE POSSIBILITY OF SUCH DAMAGES. LICENSEE AGREES THAT IT WILL NOT
 * MAKE ANY WARRANTY ON BEHALF OF CARNEGIE MELLON UNIVERSITY, EXPRESS OR IMPLIED, TO ANY PERSON CONCERNING THE
 * APPLICATION OF OR THE RESULTS TO BE OBTAINED WITH THE DELIVERABLES UNDER THIS LICENSE.
 *
 * Licensee hereby agrees to defend, indemnify, and hold harmless Carnegie Mellon University, its trustees, officers,
 * employees, and agents from all claims or demands made against them (and any related losses, expenses, or
 * attorney's fees) arising out of, or relating to Licensee's and/or its sub licensees' negligent use or willful
 * misuse of or negligent conduct or willful misconduct regarding the Software, facilities, or other rights or
 * assistance granted by Carnegie Mellon University under this License, including, but not limited to, any claims of
 * product liability, personal injury, death, damage to property, or violation of any laws or regulations.
 *
 * Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 *
 * </copyright>
 *
 *
 * @version $Id: SaveInEMFXML.java,v 1.5 2010-04-02 19:44:45 jseibel Exp $
 */
package org.osate.ui.actions;

import org.eclipse.ui.IWorkbenchWindowActionDelegate;


/**
 * SaveInEMFXML saves an AADL model in XML using the EMF reference format.
 * @see IWorkbenchWindowActionDelegate
 */
/*
 * XXX: Commented out entire class to remove error markers.  Not currently used in Aadl 2 beta.
 * Need to check if this should be used after implementing the Xtext parser.
 */
public class SaveInEMFXML /*implements IWorkbenchWindowActionDelegate, IObjectActionDelegate */{
//	/** the current selection in the AADL model
//	 *
//	 */
//	private Set currentSelection = Collections.EMPTY_SET;
//	private IWorkbenchWindow window;
//	
//	/**
//	 * The constructor.
//	 */
//	public SaveInEMFXML() {
//	}
//
//    /**
//     * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
//     */
//    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
//    	this.window = targetPart.getSite().getWorkbenchWindow();
//    }
//
//	/**
//	 * The action has been activated. The argument of the
//	 * method represents the 'real' action sitting
//	 * in the workbench UI.
//	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
//	 */
//	public void run(IAction action) {
//		if (currentSelection.isEmpty()) {
//			MessageDialog.openError(getShell(),
//					"Save in EMF format",	"No resource(s) selected.");
//			return;
//		}
//		for (final Iterator rsrcs = currentSelection.iterator(); rsrcs.hasNext();) {
//			final IResource rsrc = (IResource) rsrcs.next();
//			final Resource res = OsateResourceManager.getResource(rsrc);
//			URI emfURI = res.getURI().trimFileExtension().appendFileExtension(("aael"));
//			((CoreResourceImpl)res).saveAsEMF(emfURI);
//		}
//	}
///**
//	 * Selection in the workbench has been changed. We
//	 * can change the state of the 'real' action here
//	 * if we want, but this can only happen after
//	 * the delegate has been created.
//	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
//	 */
//	public void selectionChanged(IAction action, ISelection selection) {
//		if (selection instanceof IStructuredSelection) {
//			currentSelection = new HashSet();
//			for (final Iterator elts = ((IStructuredSelection) selection).iterator(); elts.hasNext();) {
//				final Object object = elts.next();
//				if (object != null && object instanceof IFile) {
//					currentSelection.add(object);
//				}
//			}
//		}
//	}
//
//	/**
//	 * We can use this method to dispose of any system
//	 * resources we previously allocated.
//	 * @see IWorkbenchWindowActionDelegate#dispose
//	 */
//	public void dispose() {
//	}
//
//	/**
//	 * We will cache window object in order to
//	 * be able to provide parent shell for the message dialog.
//	 * @see IWorkbenchWindowActionDelegate#init
//	 */
//	public void init(IWorkbenchWindow window) {
//		this.window = window;
//	}
//
//	private final Shell getShell() {
//		return this.window.getShell();
//	}
}