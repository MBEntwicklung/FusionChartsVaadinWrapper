package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.terminal.Resource;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.Data;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.Line;

@SuppressWarnings("serial")
public abstract class SingleSeriesChart extends FusionChart {

	private final List<Data> datas;

	private final List<Line> trendlines;

	public SingleSeriesChart(final String swfFilePath) {
		super(swfFilePath);

		this.datas = new ArrayList<Data>();
		this.trendlines = new ArrayList<Line>();
	}

	public SingleSeriesChart(Resource chartResource) {
		super(chartResource);

		this.datas = new ArrayList<Data>();
		this.trendlines = new ArrayList<Line>();
	}
	
	@Override
	protected InputStream getXmlDataInputStream() {
		return xmlDataGenerator.generateSingleSeriesDataTemplate(this);
	}

	@Override
	public void setData(Object data) {
		if (data instanceof Data) {
			addData((Data) data);
		}
	}

	public void addData(final Data data) {
		datas.add(data);
	}

	public List<Data> getDatas() {
		return datas;
	}

	public void addTrendLine(final Line line) {
		trendlines.add(line);
	}
	
	public List<Line> getTrendlines() {
		return trendlines;
	}
}
