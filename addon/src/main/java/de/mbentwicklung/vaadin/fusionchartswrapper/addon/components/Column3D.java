/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;

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

	@Override
	protected InputStream getXmlDataInputStream() {
		return getClass().getResourceAsStream("/data.xml");
	}

}
