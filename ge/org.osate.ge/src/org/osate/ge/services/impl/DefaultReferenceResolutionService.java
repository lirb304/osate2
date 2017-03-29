/*******************************************************************************
 * Copyright (C) 2016 University of Alabama in Huntsville (UAH)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The US Government has unlimited rights in this work in accordance with W31P4Q-10-D-0092 DO 0105
 *******************************************************************************/
package org.osate.ge.services.impl;

import java.util.Objects;

import org.osate.ge.services.ReferenceResolutionService;
import org.osate.ge.internal.diagram.CanonicalBusinessObjectReference;
import org.osate.ge.internal.services.ReferenceService;
import org.osate.ge.internal.services.impl.ReferenceEncoder;

public class DefaultReferenceResolutionService implements ReferenceResolutionService {
	private final ReferenceService srService;
	
	public DefaultReferenceResolutionService(final ReferenceService srService) {
		this.srService = Objects.requireNonNull(srService, "srService must not be null");
	}
	
	@Override
	public Object getReferencedObject(final String reference) {
		// Break the reference into segments
		final String[] ref = ReferenceEncoder.decode(reference);
		if(ref == null) {
			return null;
		}
				
		return srService.resolve(new CanonicalBusinessObjectReference(ref));
	}
}
