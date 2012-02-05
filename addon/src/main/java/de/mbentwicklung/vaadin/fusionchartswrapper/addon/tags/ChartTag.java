package de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags;

public class ChartTag {

	private final String caption;
	private final String subcaption;
	private final String xAxisName;
	private final String yAxisName;
	private final String numberPrefix;

	public ChartTag(String caption, String subcaption, String xAxisName,
			String yAxisName, String numberPrefix) {
		super();
		this.caption = caption;
		this.subcaption = subcaption;
		this.xAxisName = xAxisName;
		this.yAxisName = yAxisName;
		this.numberPrefix = numberPrefix;
	}

	public String getCaption() {
		return (caption == null) ? "" : caption;
	}

	public String getSubcaption() {
		return (subcaption == null) ? "" : subcaption;
	}

	public String getxAxisName() {
		return (xAxisName == null) ? "" : xAxisName;
	}

	public String getyAxisName() {
		return (yAxisName == null) ? "" : yAxisName;
	}

	public String getNumberPrefix() {
		return (numberPrefix == null) ? "" : numberPrefix;
	}

}
