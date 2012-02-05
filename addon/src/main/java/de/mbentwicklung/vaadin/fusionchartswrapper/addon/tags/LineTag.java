package de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags;

public class LineTag {

	private final int startValue;
	private final String color;
	private final String displayValue;

	public LineTag(int startValue, String color, String displayValue) {
		super();
		this.startValue = startValue;
		this.color = color;
		this.displayValue = displayValue;
	}

	public int getStartValue() {
		return startValue;
	}

	public String getColor() {
		return color;
	}

	public String getDisplayValue() {
		return displayValue;
	}

}
