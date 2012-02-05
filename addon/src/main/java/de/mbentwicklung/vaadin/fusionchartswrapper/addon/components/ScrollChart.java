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
public class ScrollChart extends FusionChart {

	public ScrollChart(String chartResource) {
		super(chartResource);
	}

	public ScrollChart(Resource chartResource) {
		super(chartResource);
	}

	@Override
	protected InputStream getXmlDataInputStream() {
		return xmlDataGenerator.generateScrollDataTemplate(this);
	}

}
