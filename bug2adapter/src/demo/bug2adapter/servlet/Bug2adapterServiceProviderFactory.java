/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *     Michael Fiedler      - Bugzilla adapter implementation
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/


package demo.bug2adapter.servlet;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.eclipse.lyo.oslc4j.client.ServiceProviderRegistryURIs;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.PrefixDefinition;
import org.eclipse.lyo.oslc4j.core.model.Publisher;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderFactory;

import demo.bug2adapter.Bug2adapterConstants;
import demo.bug2adapter.services.Bug2ChangeRequestService;	


// Start of user code imports
// End of user code

public class Bug2adapterServiceProviderFactory
{
    private static Class<?>[] RESOURCE_CLASSES =
    {
		Bug2ChangeRequestService.class	
    };

    private Bug2adapterServiceProviderFactory()
    {
        super();
    }

    /**
     * Create �a new Bugzilla OSLC change management service provider.
     * @param baseURI
     * @param serviceProviderTitle
     * @param parameterValueMap - a map containing the path replacement value for {serviceProviderId}.  See ServiceProviderCatalogSingleton.initServiceProviders()
     * @return
     * @throws OslcCoreApplicationException
     * @throws URISyntaxException
     */
    public static ServiceProvider createServiceProvider(final String baseURI, final String title, final String description, final Publisher publisher, final Map<String,Object> parameterValueMap)
           throws OslcCoreApplicationException, URISyntaxException
    {
        final ServiceProvider serviceProvider = ServiceProviderFactory.createServiceProvider(baseURI,
                                                                                             ServiceProviderRegistryURIs.getUIURI(),
                                                                                             title,
                                                                                             description,
                                                                                             publisher,
                                                                                             RESOURCE_CLASSES,
                                                                                             parameterValueMap);
        URI detailsURIs[] = {new URI(baseURI)};
        serviceProvider.setDetails(detailsURIs);

        final PrefixDefinition[] prefixDefinitions =
        {
            new PrefixDefinition(OslcConstants.DCTERMS_NAMESPACE_PREFIX, new URI(OslcConstants.DCTERMS_NAMESPACE)),
            new PrefixDefinition(OslcConstants.OSLC_CORE_NAMESPACE_PREFIX, new URI(OslcConstants.OSLC_CORE_NAMESPACE)),
            new PrefixDefinition(OslcConstants.OSLC_DATA_NAMESPACE_PREFIX, new URI(OslcConstants.OSLC_DATA_NAMESPACE)),
            new PrefixDefinition(OslcConstants.RDF_NAMESPACE_PREFIX, new URI(OslcConstants.RDF_NAMESPACE)),
            new PrefixDefinition(OslcConstants.RDFS_NAMESPACE_PREFIX, new URI(OslcConstants.RDFS_NAMESPACE)),
			new PrefixDefinition(Bug2adapterConstants.BUG2_NAMSPACE_PREFIX, new URI(Bug2adapterConstants.BUG2_NAMSPACE))
,
			new PrefixDefinition(Bug2adapterConstants.CHANGE_MANAGEMENT_NAMSPACE_PREFIX, new URI(Bug2adapterConstants.CHANGE_MANAGEMENT_NAMSPACE))
,
			new PrefixDefinition(Bug2adapterConstants.DUBLIN_CORE_NAMSPACE_PREFIX, new URI(Bug2adapterConstants.DUBLIN_CORE_NAMSPACE))
,
			new PrefixDefinition(Bug2adapterConstants.FOAF_NAMSPACE_PREFIX, new URI(Bug2adapterConstants.FOAF_NAMSPACE))
,
			new PrefixDefinition(Bug2adapterConstants.OSLC_CORE_NAMSPACE_PREFIX, new URI(Bug2adapterConstants.OSLC_CORE_NAMSPACE))
,
			new PrefixDefinition(Bug2adapterConstants.RDF_NAMSPACE_PREFIX, new URI(Bug2adapterConstants.RDF_NAMSPACE))
        };

        serviceProvider.setPrefixDefinitions(prefixDefinitions);

        return serviceProvider;
    }
}
