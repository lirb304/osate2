/*
 * generated by Xtext
 */
package org.osate.expr;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ExprStandaloneSetup extends ExprStandaloneSetupGenerated{

	public static void doSetup() {
		new ExprStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

