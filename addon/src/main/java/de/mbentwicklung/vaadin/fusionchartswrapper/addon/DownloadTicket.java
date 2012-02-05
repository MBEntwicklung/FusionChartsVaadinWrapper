/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Marc Bellmann
 * 
 */
public final class DownloadTicket {

	private final static int FIRST_DOWNLOAD_TICKET_NUMBER = 0;

	private static AtomicInteger downloadTicketNumber = new AtomicInteger(
			FIRST_DOWNLOAD_TICKET_NUMBER);

	public static int getNewDownloadTicketNumber() {
		downloadTicketNumber.weakCompareAndSet(Integer.MAX_VALUE,
				FIRST_DOWNLOAD_TICKET_NUMBER);
		return downloadTicketNumber.incrementAndGet();
	}

}
