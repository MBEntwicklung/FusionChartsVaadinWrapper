package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.terminal.Resource;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.CategoryTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.DataTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.DatasetTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.LineTag;

@SuppressWarnings("serial")
public abstract class MultiSeriesCharts extends FusionChart {

	private List<DatasetTag> datasets;
	private List<LineTag> trendlines;
	private List<CategoryTag> categories;

	public MultiSeriesCharts(final String swfFilePath) {
		super(swfFilePath);

		this.datasets = new ArrayList<DatasetTag>();
		this.categories = new ArrayList<CategoryTag>();
		this.trendlines = new ArrayList<LineTag>();
	}

	public MultiSeriesCharts(final Resource chartResource) {
		super(chartResource);

		datasets = new ArrayList<DatasetTag>();
		trendlines = new ArrayList<LineTag>();
		categories = new ArrayList<CategoryTag>();
	}

	@Override
	protected InputStream getXmlDataInputStream() {
		return xmlDataGenerator.generateMultiSeriesDataTemplate(this);
	}

	public List<DatasetTag> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<DatasetTag> datasets) {
		this.datasets = datasets;
	}

	public List<LineTag> getTrendlines() {
		return trendlines;
	}

	public void setTrendlines(List<LineTag> trendlines) {
		this.trendlines = trendlines;
	}

	public List<CategoryTag> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryTag> categories) {
		this.categories = categories;
	}

}
