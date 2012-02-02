package de.mbentwicklung.vaadin.fusionchartswrapper.addon.datagenerator;

import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.SingleSeriesChart;

public class XmlDataGenerator {

	private static final String UTF_8 = "UTF-8";
	private static final String TPL_SINGLE_SERIES = "chart-templates/single-series-charts.tpl";
	private VelocityEngine velocityEngine;

	public XmlDataGenerator() {
		velocityEngine = new VelocityEngine();
		velocityEngine.setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM_CLASS,
				"org.apache.velocity.runtime.log.NullLogSystem");
		velocityEngine.setProperty(VelocityEngine.RESOURCE_LOADER, "class");
		velocityEngine
				.setProperty("class.resource.loader.class",
						"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		velocityEngine.init();
	}

	public InputStream generateSingleSeriesDataTemplate(
			final SingleSeriesChart chart) {
		final VelocityContext context = new VelocityContext();

		Template template = null;

		try {
			template = velocityEngine.getTemplate(TPL_SINGLE_SERIES, UTF_8);
			
			velocityEngine.addProperty("", chart.getDatas());
			StringWriter writer = new StringWriter();
			template.merge(context, writer);

			return IOUtils.toInputStream(writer.toString());
		} catch (ResourceNotFoundException rnfe) {
		} catch (ParseErrorException pee) {
		} catch (MethodInvocationException mie) {
		} catch (Exception e) {
		}
		return null;
	}

}
