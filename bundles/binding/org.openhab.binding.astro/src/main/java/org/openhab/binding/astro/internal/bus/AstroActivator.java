/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.astro.internal.bus;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Extension of the default OSGi bundle activator
 *
 * @author Gerhard Riegler
 * @since 1.5.0
 */
public final class AstroActivator implements BundleActivator {
    private static Logger logger = LoggerFactory.getLogger(AstroActivator.class);

    private static BundleContext context;

    /**
     * Called whenever the OSGi framework starts our bundle
     */
    @Override
    public void start(BundleContext context) throws Exception {
        AstroActivator.context = context;
        logger.debug("Astro binding has been started.");
    }

    /**
     * Called whenever the OSGi framework stops our bundle
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        AstroActivator.context = null;
        logger.debug("Astro binding has been stopped.");
    }

    /**
     * Returns the bundle context of this bundle
     * 
     * @return the bundle context
     */
    public static BundleContext getContext() {
        return context;
    }
}
