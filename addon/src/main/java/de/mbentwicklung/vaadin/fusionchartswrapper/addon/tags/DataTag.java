package de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags;

public abstract class DataTag {

	public abstract DataType getDataType();

	protected enum DataType {
		SET, VLINE, CATEGORY;
	}
}
