package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import com.vaadin.Application;

@SuppressWarnings("serial")
public class Area2D extends SingleSeriesChart {

	public Area2D(final Application application) {
		super("Charts/Area2D.swf");

		application.getMainWindow().addURIHandler(createDataChartHandler());
	}

	@Override
	protected String getChartId() {
		return getClass().getCanonicalName();
	}

}
