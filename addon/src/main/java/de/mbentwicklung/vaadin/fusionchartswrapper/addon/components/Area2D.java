package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.SetTag;


@SuppressWarnings("serial")
public class Area2D extends SingleSeriesChart {

	public static Area2D create(
			final SetTag... datas) {
		Area2D chart = new Area2D();
		chart.addData(datas);
		return chart;
	}

	public Area2D() {
		super("Charts/Area2D.swf");
	}
}
