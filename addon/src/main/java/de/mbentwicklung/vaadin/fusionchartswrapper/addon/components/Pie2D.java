package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import com.vaadin.Application;

@SuppressWarnings("serial")
public class Pie2D extends SingleSeriesChart {

	public Pie2D(final Application application) {
		super("Charts/Pie2D.swf");

		application.getMainWindow().addURIHandler(createDataChartHandler());
	}

	@Override
	protected String getChartId() {
		return getClass().getCanonicalName();
	}

}
