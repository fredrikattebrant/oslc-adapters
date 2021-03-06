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
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/


package demo.bug2adapter.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import demo.bug2adapter.servlet.ServletListener; 
import demo.bug2adapter.Bug2adapterConstants;
import demo.bug2adapter.resources.Person;	
import demo.bug2adapter.resources.Person;	
import demo.bug2adapter.resources.Type;	

// Start of user code imports
// End of user code

@OslcNamespace(Bug2adapterConstants.BUG2_NAMSPACE)
@OslcName(Bug2adapterConstants.BUG2CHANGEREQUEST) 
@OslcResourceShape(title = "Bug2ChangeRequest Resource Shape", describes = Bug2adapterConstants.TYPE_BUG2CHANGEREQUEST)
public class Bug2ChangeRequest
       extends ChangeRequest
       
{

private String product;  
private String component;  
private String version;  

public Bug2ChangeRequest()
       throws URISyntaxException
{
    super();

	// Start of user code constructor1
	// End of user code
}

public Bug2ChangeRequest(final URI about)
       throws URISyntaxException
{
    super(about);

	// Start of user code constructor2
	// End of user code
}

public static URI constructURI(String serviceProviderId, String bug2ChangeRequestId) throws URISyntaxException, UnsupportedEncodingException
{
	return new URI(ServletListener.getServicesBase() + "/" + serviceProviderId + "/bug2ChangeRequests/"+ bug2ChangeRequestId);
}

public String toString()
{
		String result = "";
		// Start of user code toString_init
		// End of user code

		result = getAbout().toString();

		// Start of user code toString_finalize
		// End of user code

		return result;
}

public String toHtml()
{
		String result = "";
		// Start of user code toHtml_init
		// End of user code

		result = "<a href=\"" + getAbout() + "\">" + toString() + "</a>";

		// Start of user code toHtml_finalize
		// End of user code

		return result;
}



   	@OslcName("product")
   	@OslcPropertyDefinition(Bug2adapterConstants.BUG2_NAMSPACE + "product")
	
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcValueType(ValueType.String)
	
	
	@OslcReadOnly(false)
	
    public String getProduct()
    {
        return product;
    }

   	@OslcName("component")
   	@OslcPropertyDefinition(Bug2adapterConstants.BUG2_NAMSPACE + "component")
	
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcValueType(ValueType.String)
	
	
	@OslcReadOnly(false)
	@OslcTitle("Component")
    public String getComponent()
    {
        return component;
    }

   	@OslcName("version")
   	@OslcPropertyDefinition(Bug2adapterConstants.BUG2_NAMSPACE + "version")
	
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcValueType(ValueType.String)
	
	
	@OslcReadOnly(false)
	@OslcTitle("Version")
    public String getVersion()
    {
        return version;
    }


    public void setProduct(final String product )
    {
        this.product = product;
    }
    public void setComponent(final String component )
    {
        this.component = component;
    }
    public void setVersion(final String version )
    {
        this.version = version;
    }

    static public String productToHtmlForCreation (final HttpServletRequest httpServletRequest, final String serviceProviderId)
    {
		String s = "";

		// Start of user code productasHtmlForCreation_init
		// End of user code

		s = s + "<label for=\"product\">product: </LABEL>";

		// Start of user code productasHtmlForCreation_mid
		// End of user code

				s= s + "<input name=\"product\" type=\"text\" style=\"width: 400px\" id=\"product\" >";

		// Start of user code productasHtmlForCreation_finalize
		// End of user code

		return s; 
    }
    static public String componentToHtmlForCreation (final HttpServletRequest httpServletRequest, final String serviceProviderId)
    {
		String s = "";

		// Start of user code componentasHtmlForCreation_init
		// End of user code

		s = s + "<label for=\"component\">component: </LABEL>";

		// Start of user code componentasHtmlForCreation_mid
		// End of user code

				s= s + "<input name=\"component\" type=\"text\" style=\"width: 400px\" id=\"component\" >";

		// Start of user code componentasHtmlForCreation_finalize
		// End of user code

		return s; 
    }
    static public String versionToHtmlForCreation (final HttpServletRequest httpServletRequest, final String serviceProviderId)
    {
		String s = "";

		// Start of user code versionasHtmlForCreation_init
		// End of user code

		s = s + "<label for=\"version\">version: </LABEL>";

		// Start of user code versionasHtmlForCreation_mid
		// End of user code

				s= s + "<input name=\"version\" type=\"text\" style=\"width: 400px\" id=\"version\" >";

		// Start of user code versionasHtmlForCreation_finalize
		// End of user code

		return s; 
    }

    public String productToHtml()
    {
		String s = "";

		// Start of user code producttoHtml_init
		// End of user code

		s = s + "<label for=\"product\"><strong>product</strong>: </LABEL>";

		// Start of user code producttoHtml_mid
		// End of user code

		try {
				if (product == null) {
					s= s + "<em>null</em>";				
				}
				else {
					s= s + product.toString();				
				}
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

		// Start of user code producttoHtml_finalize
		// End of user code

		return s; 
    }
    public String componentToHtml()
    {
		String s = "";

		// Start of user code componenttoHtml_init
		// End of user code

		s = s + "<label for=\"component\"><strong>component</strong>: </LABEL>";

		// Start of user code componenttoHtml_mid
		// End of user code

		try {
				if (component == null) {
					s= s + "<em>null</em>";				
				}
				else {
					s= s + component.toString();				
				}
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

		// Start of user code componenttoHtml_finalize
		// End of user code

		return s; 
    }
    public String versionToHtml()
    {
		String s = "";

		// Start of user code versiontoHtml_init
		// End of user code

		s = s + "<label for=\"version\"><strong>version</strong>: </LABEL>";

		// Start of user code versiontoHtml_mid
		// End of user code

		try {
				if (version == null) {
					s= s + "<em>null</em>";				
				}
				else {
					s= s + version.toString();				
				}
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

		// Start of user code versiontoHtml_finalize
		// End of user code

		return s; 
    }

}

