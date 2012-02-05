package de.mbentwicklung.vaadin.fusionchartswrapper.addon;

import java.io.InputStream;
import java.net.URL;

import com.vaadin.terminal.DownloadStream;
import com.vaadin.terminal.URIHandler;

@SuppressWarnings("serial")
public class DataHandler implements URIHandler {

	private final String dataDownloadId;

	private final InputStream xmlDataInputStream;

	public DataHandler(final String dataDownloadId,
			final InputStream xmlDataInputStream) {
		this.dataDownloadId = dataDownloadId;
		this.xmlDataInputStream = xmlDataInputStream;
	}

	public DownloadStream handleURI(URL context, String relativeUri) {
		if (relativeUri.startsWith(dataDownloadId)) {
			return new DownloadStream(xmlDataInputStream, "application/xml",
					relativeUri);
		}
		return null;
	}

}
