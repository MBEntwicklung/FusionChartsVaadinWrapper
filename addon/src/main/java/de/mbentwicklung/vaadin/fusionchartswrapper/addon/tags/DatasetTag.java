package de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags;

import java.util.Arrays;
import java.util.List;

public class DatasetTag {

	private final String seriesName;
	private final List<SetTag> sets;

	public DatasetTag(String seriesName, List<SetTag> sets) {
		super();
		this.seriesName = seriesName;
		this.sets = sets;
	}

	public DatasetTag(String seriesName, SetTag... sets) {
		super();
		this.seriesName = seriesName;
		this.sets = Arrays.asList(sets);
	}

	public String getSeriesName() {
		return seriesName;
	}

	public List<SetTag> getSets() {
		return sets;
	}
}
