/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;
import java.net.URL;

import com.vaadin.terminal.DownloadStream;
import com.vaadin.terminal.Resource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.terminal.URIHandler;
import com.vaadin.ui.Embedded;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.datagenerator.XmlDataGenerator;

/**
 * @author marc
 * 
 */
public abstract class FusionChart extends Embedded {

	/** serialVersionUID */
	private static final long serialVersionUID = 4830248025522579621L;

	protected final XmlDataGenerator xmlDataGenerator;

	private String subcaption;
	private String xAxisName;
	private String yAxisName;
	private String numberPrefix;

	public FusionChart(final String swfFilePath) {
		this(new ThemeResource(swfFilePath));
	}

	public FusionChart(final Resource chartResource) {
		super(null, chartResource);

		this.xmlDataGenerator = new XmlDataGenerator();

		setWidth("400px");
		setHeight("400px");

		setParameter("FlashVars", "&dataUrl=" + getChartId());

	}

	protected URIHandler createDataChartHandler() {
		return new URIHandler() {

			/** serialVersionUID */
			private static final long serialVersionUID = -3676189236894479942L;

			public DownloadStream handleURI(URL context, String relativeUri) {
				if (relativeUri.startsWith(getChartId())) {
					return new DownloadStream(getXmlDataInputStream(),
							"application/xml", relativeUri);
				}
				return null;
			}
		};
	}

	protected abstract String getChartId();

	protected abstract InputStream getXmlDataInputStream();

}
