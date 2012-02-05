package de.mbentwicklung.vaadin.fusionchartswrapper.addon;

public class DataSet extends Data {

	/* optional */
	private final String color;
	private final String toolTip;
	private final String link;
	private final boolean showLabel;

	public DataSet(String label, double value) {
		this(label, value, null, null, null, true);
	}

	public DataSet(String label, double value, String color, String toolTip,
			String link, boolean showLabel) {
		super(label, value);
		this.color = color;
		this.toolTip = toolTip;
		this.link = link;
		this.showLabel = showLabel;
	}

}
