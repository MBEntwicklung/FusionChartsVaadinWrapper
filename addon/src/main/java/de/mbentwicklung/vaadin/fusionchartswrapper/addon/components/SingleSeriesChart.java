package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vaadin.terminal.Resource;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.DataTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.LineTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.SetTag;

@SuppressWarnings("serial")
public abstract class SingleSeriesChart extends FusionChart {

	private final List<DataTag> datas;

	private final List<LineTag> trendlines;

	public SingleSeriesChart(final String swfFilePath) {
		super(swfFilePath);

		this.datas = new ArrayList<DataTag>();
		this.trendlines = new ArrayList<LineTag>();
	}

	public SingleSeriesChart(Resource chartResource) {
		super(chartResource);

		this.datas = new ArrayList<DataTag>();
		this.trendlines = new ArrayList<LineTag>();
	}
	
	@Override
	protected InputStream getXmlDataInputStream() {
		return xmlDataGenerator.generateSingleSeriesDataTemplate(this);
	}

	@Override
	public void setData(Object data) {
		if (data instanceof DataTag) {
			addData((SetTag) data);
		}
	}

	public void addData(final DataTag ... data) {
		datas.addAll(Arrays.asList(data));
	}

	public List<DataTag> getDatas() {
		return datas;
	}

	public void addTrendLine(final LineTag... line) {
		trendlines.addAll(Arrays.asList(line));
	}
	
	public List<LineTag> getTrendlines() {
		return trendlines;
	}
}
