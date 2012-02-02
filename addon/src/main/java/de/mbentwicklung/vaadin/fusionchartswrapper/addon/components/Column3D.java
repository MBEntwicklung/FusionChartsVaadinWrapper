/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import com.vaadin.Application;

/**
 * @author marc
 *
 */
@SuppressWarnings("serial")
public class Column3D extends SingleSeriesChart {

	public Column3D(final Application application) {
		super("Charts/Column3D.swf");

		application.getMainWindow().addURIHandler(createDataChartHandler());
	}

	@Override
	protected String getChartId() {
		return getClass().getCanonicalName();
	}

}
