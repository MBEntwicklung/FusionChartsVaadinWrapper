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
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.ChartTag;

/**
 * @author Marc Bellmann
 */
public abstract class FusionChart extends Embedded {

	/** serialVersionUID */
	private static final long serialVersionUID = 4830248025522579621L;

	protected final XmlDataGenerator xmlDataGenerator;
	protected final String dataDownloadId;

	private ChartTag chartTag;

	public FusionChart(final String swfFilePath) {
		this(new ThemeResource(swfFilePath));
	}

	public FusionChart(final Resource chartResource) {
		super(null, chartResource);

		this.xmlDataGenerator = new XmlDataGenerator();
		this.dataDownloadId = "FusionChart_"
				+ DownloadTicket.getNewDownloadTicketNumber() + ".xml";

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

	public ChartTag getChartTag() {
		return (chartTag == null) ? new ChartTag("", "", "", "", "") : chartTag;
	}

	public void setChartTag(ChartTag chartTag) {
		this.chartTag = chartTag;
	}
}
