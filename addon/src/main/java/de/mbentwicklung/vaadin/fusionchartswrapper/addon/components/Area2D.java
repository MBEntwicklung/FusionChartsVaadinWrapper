package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import com.vaadin.Application;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.Data;

@SuppressWarnings("serial")
public class Area2D extends SingleSeriesChart {

	public static Area2D create(
			final Application application,
			final Data... datas) {
		Area2D chart = new Area2D(application);
		chart.addData(datas);
		return chart;
	}

	public Area2D(final Application application) {
		super("Charts/Area2D.swf");

		application.getMainWindow().addURIHandler(createDataChartHandler());
	}

	@Override
	protected String getChartId() {
		return getClass().getCanonicalName();
	}

}
