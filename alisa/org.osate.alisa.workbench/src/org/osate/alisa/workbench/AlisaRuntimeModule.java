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
package org.osate.alisa.workbench;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class AlisaRuntimeModule extends org.osate.alisa.workbench.AbstractAlisaRuntimeModule {
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return org.osate.alisa.common.naming.CommonQualifiedNameConverter.class;
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return org.osate.alisa.workbench.services.WorkbenchValueConverters.class;
	}

	public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return org.osate.alisa.workbench.generator.AlisaOutputConfigurationProvider.class;
	}

}
