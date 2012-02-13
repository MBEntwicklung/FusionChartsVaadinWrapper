/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import com.vaadin.terminal.Resource;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.ChartTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.components.FusionChart;

/**
 * @author marc
 * 
 */
@SuppressWarnings("serial")
public abstract class AbstractFusionChart extends FusionChart {

	private ChartTag chartTag;

	public AbstractFusionChart(final String swfFilePath) {
		super(swfFilePath);
	}

	public AbstractFusionChart(final Resource chartResource) {
		super(chartResource);
	}

	public ChartTag getChartTag() {
		if (chartTag == null) {
			return new ChartTag("", "", "", "", "");
		}
		return chartTag;
	}

	public void setChartTag(ChartTag chartTag) {
		this.chartTag = chartTag;
	}

}
