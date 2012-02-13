/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import com.vaadin.terminal.Resource;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.datagenerator.StringDataGenerator;

/**
 * @author marc
 * 
 */
@SuppressWarnings("serial")
public class StackedChart extends AbstractFusionChart {

	public StackedChart(Resource chartResource) {
		super(chartResource);
	}

	public StackedChart(String chartResource) {
		super(chartResource);
	}

	@Override
	protected String getDataAsString() {
		return new StringDataGenerator().generateStackedDataTemplate(this);
	}

}
