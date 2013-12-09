/*******************************************************************************
 * Copyright (C) 2013 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0073.
 *******************************************************************************/
package edu.uah.rsesc.aadl.age.services;

import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import edu.uah.rsesc.aadl.age.services.impl.DefaultStyleProviderService;
import edu.uah.rsesc.aadl.age.services.impl.SimpleServiceFactory;

// CLEAN-UP: Needs to be merged with StyleService
public interface StyleProviderService {
	public static class Factory extends SimpleServiceFactory {
		public Factory() {
			super(StyleProviderService.class, DefaultStyleProviderService.class);
		}
	}
	
	Style getStyle(Diagram diagram, String id);
}
