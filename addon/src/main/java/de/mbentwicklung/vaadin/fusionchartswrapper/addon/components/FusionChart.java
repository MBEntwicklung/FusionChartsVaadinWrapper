/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;

import java.io.InputStream;

import com.vaadin.terminal.Resource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Embedded;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.DataHandler;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.DownloadTicket;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.datagenerator.XmlDataGenerator;

/**
 * @author Marc Bellmann
 */
public abstract class FusionChart extends Embedded {

	/** serialVersionUID */
	private static final long serialVersionUID = 4830248025522579621L;

	protected final XmlDataGenerator xmlDataGenerator;
	protected final String dataDownloadId;

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
		this.dataDownloadId = "FusionChart_"
				+ DownloadTicket.getNewDownloadTicketNumber() + ".xml";
		System.out.println(dataDownloadId);

		setWidth("400px");
		setHeight("400px");

		setParameter("FlashVars", "&dataUrl=" + dataDownloadId);

	}

	private void registerDataHandler() {
		final DataHandler dataHandler = new DataHandler(dataDownloadId,
				getXmlDataInputStream());

		getApplication().getMainWindow().addURIHandler(dataHandler);
	}

	@Override
	public void attach() {
		super.attach();

		// Registriere DataHandler mit Data xml's
		registerDataHandler();
	}

	protected abstract InputStream getXmlDataInputStream();

	public String getSubcaption() {
		return (subcaption == null) ? "" : subcaption;
	}

	public void setSubcaption(String subcaption) {
		this.subcaption = subcaption;
	}

	public String getxAxisName() {
		return (xAxisName == null) ? "" : xAxisName;
	}

	public void setxAxisName(String xAxisName) {
		this.xAxisName = xAxisName;
	}

	public String getyAxisName() {
		return (yAxisName == null) ? "" : yAxisName;
	}

	public void setyAxisName(String yAxisName) {
		this.yAxisName = yAxisName;
	}

	public String getNumberPrefix() {
		return (numberPrefix == null) ? "" : numberPrefix;
	}

	public void setNumberPrefix(String numberPrefix) {
		this.numberPrefix = numberPrefix;
	}
	
	@Override
	public String getCaption() {
		final String caption = super.getCaption();
		return (caption == null) ? "" : caption;	
	}

}
