package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

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

}
