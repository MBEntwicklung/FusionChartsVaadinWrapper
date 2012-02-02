package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import com.vaadin.Application;

@SuppressWarnings("serial")
public class Line extends SingleSeriesChart {

	public Line(final Application application) {
		super("Charts/Line.swf");

		application.getMainWindow().addURIHandler(createDataChartHandler());
	}

	@Override
	protected String getChartId() {
		return getClass().getCanonicalName();
	}

}
