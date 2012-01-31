package de.mbentwicklung.vaadin.fusionchartswrapper.addon;

public class Line {

	private final String startValue;
	private final String color;
	private final String displayValue;

	public Line(String startValue, String color, String displayValue) {
		super();
		this.startValue = startValue;
		this.color = color;
		this.displayValue = displayValue;
	}

	public String getStartValue() {
		return startValue;
	}

	public String getColor() {
		return color;
	}

	public String getDisplayValue() {
		return displayValue;
	}

}
