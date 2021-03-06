package org.gwt.leaflet.search.client;

import com.google.gwt.core.client.GWT;

/**
 * <b>Leaflet {@link Search} control interface</b>
 */
public interface Search {
	
	static final Search INSTANCE = GWT.create(Search.class);
	
	/**
	 * Set search service instance (request-based).
	 * @param service - {@link SearchService} instance
	 * @return {@link Search this}
	 */
	Search setService(SearchService service);
	
	/**
	 * Set search handler instance (callback-based).
	 * @param handler - {@link SearchHandler} instance
	 * @return {@link Search this}
	 */
	Search setHandler(SearchHandler handler);

}
