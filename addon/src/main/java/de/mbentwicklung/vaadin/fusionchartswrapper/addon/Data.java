package de.mbentwicklung.vaadin.fusionchartswrapper.addon;

public class Data {

	private final String label;
	private final Number value;

	public Data(String label, Number value) {
		super();
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public Number getValue() {
		return value;
	}

}
