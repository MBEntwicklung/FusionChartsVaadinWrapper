package de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags;

public class VLineTag extends DataTag {

	private final String color;
	private final int thickness;

	public VLineTag(String color, int thickness) {
		super();
		this.color = color;
		this.thickness = thickness;
	}

	public String getColor() {
		return color;
	}

	public int getThickness() {
		return thickness;
	}

	@Override
	public DataType getDataType() {
		return DataType.VLINE;
	}
}
