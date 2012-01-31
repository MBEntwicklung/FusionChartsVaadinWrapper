package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;

import com.vaadin.Application;

@SuppressWarnings("serial")
public class Bar2D extends SingleSeriesChart {

	public Bar2D(final Application application) {
		super("Charts/Bar2D.swf");

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
