package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;

import com.vaadin.Application;

@SuppressWarnings("serial")
public class Line extends SingleSeriesChart {

	public Line(final Application application) {
		super("Charts/Column2D.swf");

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
