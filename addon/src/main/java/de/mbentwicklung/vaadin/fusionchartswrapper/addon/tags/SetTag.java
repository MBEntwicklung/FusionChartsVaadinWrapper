package de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags;

/**
 * TODO: Fehlende Einstellungen <set label="Jan" value="17400" color="3300FF"
 * toolTip="January, 17400" link="details.asp?month=jan" showLabel="1"/>
 * 
 * @author marc
 * 
 */
public class SetTag extends DataTag {

	private final String label;
	private final Number value;

	public SetTag(String label, Number value) {
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

	@Override
	public DataType getDataType() {
		return DataType.SET;
	}
}
