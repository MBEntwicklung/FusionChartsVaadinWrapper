package de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags;

public class CategoryTag extends DataTag {

	private final String label;

	public CategoryTag(String label) {
		super();
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	@Override
	public DataType getDataType() {
		return DataType.CATEGORY;
	}
}
