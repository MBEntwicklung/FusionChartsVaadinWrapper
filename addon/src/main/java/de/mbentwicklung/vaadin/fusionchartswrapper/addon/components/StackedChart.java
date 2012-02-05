/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;

import com.vaadin.terminal.Resource;

/**
 * @author marc
 * 
 */
@SuppressWarnings("serial")
public class StackedChart extends FusionChart {

	public StackedChart(Resource chartResource) {
		super(chartResource);
	}
	
	public StackedChart(String chartResource) {
		super(chartResource);
	}

	@Override
	protected InputStream getXmlDataInputStream() {
		return xmlDataGenerator.generateStackedDataTemplate(this);
	}

}
