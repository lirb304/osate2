/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */

/*
 * generated by Xtext
 */
package org.osate.verify.scoping

import com.google.inject.Inject
import com.rockwellcollins.atc.resolute.resolute.ClaimBody
import com.rockwellcollins.atc.resolute.resolute.FunctionDefinition
import com.rockwellcollins.atc.resolute.resolute.ResolutePackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.osate.alisa.common.common.AVariableReference
import org.osate.alisa.common.scoping.CommonScopeProvider
import org.osate.alisa.common.scoping.ICommonGlobalReferenceFinder
import org.osate.verify.verify.Claim
import org.osate.verify.verify.ResoluteMethod
import org.osate.verify.verify.VerificationActivity

import static org.osate.reqspec.util.ReqSpecUtilExtension.*
import static org.osate.verify.util.VerifyUtilExtension.*

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 * 
 */
class VerifyScopeProvider extends CommonScopeProvider {

	@Inject ICommonGlobalReferenceFinder refFinder

	def scope_ValDeclaration(VerificationActivity context, EReference reference) {
		val claim = getContainingClaim(context)
		var req = claim.requirement
		val result = scopeForGlobalVal(req,IScope.NULLSCOPE)
		return scopeForVal(req, result)
	}

	def scope_AVariableReference_variable(AVariableReference context, EReference reference) {
		val claim = getContainingClaim(context)
		var req = claim.requirement
		val result1 = scopeForGlobalVal(req,IScope.NULLSCOPE)
		val result2 = scopeForCompute(req, result1)
		return scopeForVal(req, result2)
	}

	def scope_ComputeDeclaration(VerificationActivity context, EReference reference) {
		val claim = getContainingClaim(context)
		var req = claim.requirement
//		val result = scopeForGlobalVal(req,IScope.NULLSCOPE)
		val result = IScope.NULLSCOPE
		return scopeForCompute(req, result)
	}

	def scope_Claim_requirement(Claim context, EReference reference) {
		var result = delegateGetScope(context, reference)
		val forSystemRequirements = (containingVerificationPlan(context)).getRequirementSet
		if (!forSystemRequirements.requirements.empty) {
			result = new SimpleScope(result,
				Scopes::scopedElementsFor(forSystemRequirements.requirements,
					QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), false)
		}
		return result
	}

	def scope_FunctionDefinition(ResoluteMethod context, EReference reference) {
		val foundlist = refFinder.getEObjectDescriptions(context, ResolutePackage.Literals.FUNCTION_DEFINITION, "aadl")
		if (foundlist.isEmpty)
			return IScope.NULLSCOPE
		val fcns = foundlist.map[f|EcoreUtil.resolve(f.EObjectOrProxy, context) as FunctionDefinition].filter [ fd |
			fd.body instanceof ClaimBody
		]
		return new SimpleScope(IScope.NULLSCOPE, Scopes::scopedElementsFor(fcns,
			QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), false)
	}

	def scope_VerificationActivity(EObject context, EReference reference) {
		val vas = getContainingClaim(context).activities
		new SimpleScope(IScope::NULLSCOPE, Scopes::scopedElementsFor(vas,
					QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), false)
	}

	def scope_FormalParameter(EObject context, EReference reference) {
		val formalparams = getContainingVerificationMethod(context)?.formals
		new SimpleScope(IScope::NULLSCOPE, Scopes::scopedElementsFor(formalparams,
					QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), false)
	}
}
