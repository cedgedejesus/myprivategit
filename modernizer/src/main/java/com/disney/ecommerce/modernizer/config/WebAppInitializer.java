package com.disney.ecommerce.modernizer.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
* WebInitializer class extends Abstract Annotation Config Dispatcher Servlet
* Initializer.
*
* @author  Renino Niefes
* @version 1.0
* @since   2018-04-17 
*/
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
