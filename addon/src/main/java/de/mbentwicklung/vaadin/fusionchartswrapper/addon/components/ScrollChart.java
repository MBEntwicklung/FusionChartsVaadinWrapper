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
public class ScrollChart extends AbstractFusionChart {

	public ScrollChart(String chartResource) {
		super(chartResource);
	}

	public ScrollChart(Resource chartResource) {
		super(chartResource);
	}

	@Override
	protected String getDataAsString() {
		return new StringDataGenerator().generateScrollDataTemplate(this);
	}

}
