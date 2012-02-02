package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import com.vaadin.Application;

@SuppressWarnings("serial")
public class Doughnut3D extends SingleSeriesChart {

	public Doughnut3D(final Application application) {
		super("Charts/Doughnut3D.swf");

		application.getMainWindow().addURIHandler(createDataChartHandler());
	}

	@Override
	protected String getChartId() {
		return getClass().getCanonicalName();
	}

}
