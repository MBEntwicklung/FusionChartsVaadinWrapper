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

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.MultiSeriesCharts;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.ScrollChart;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.SingleSeriesChart;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.StackedChart;

public class XmlDataGenerator {

	private static final String UTF_8 = "UTF-8";
	private static final String TPL_SINGLE_SERIES = "chart-templates/single-series-charts.tpl";
	private static final String TPL_MULTI_SERIES = "chart-templates/multi-series-charts.tpl";
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

		context.put("chart", chart.getChartTag());
		context.put("sets", chart.getDatas());
		context.put("trendlines", chart.getTrendlines());
		
		return mergeToInputStream(context, TPL_SINGLE_SERIES);
	}

	public InputStream generateMultiSeriesDataTemplate(
			final MultiSeriesCharts chart) {
		final VelocityContext context = new VelocityContext();
		context.put("chart", chart.getChartTag());
		context.put("categories", chart.getCategories());
		context.put("datasets", chart.getDatasets());
		context.put("trendlines", chart.getTrendlines());
		return mergeToInputStream(context, TPL_MULTI_SERIES);
	}

	public InputStream generateStackedDataTemplate(final StackedChart chart) {
		final VelocityContext context = new VelocityContext();
		context.put("chart", chart.getChartTag());

		return mergeToInputStream(context, TPL_MULTI_SERIES);
	}

	public InputStream generateScrollDataTemplate(ScrollChart chart) {
		final VelocityContext context = new VelocityContext();
		context.put("chart", chart.getChartTag());

		return mergeToInputStream(context, TPL_MULTI_SERIES);
	}

	private InputStream mergeToInputStream(final VelocityContext context,
			final String tpl) {
		Template template = null;
		try {
			template = velocityEngine.getTemplate(TPL_MULTI_SERIES, UTF_8);

			StringWriter writer = new StringWriter();
			template.merge(context, writer);

			System.out.println(writer.toString());
			return IOUtils.toInputStream(writer.toString());
		} catch (ResourceNotFoundException e) {
			throw new IllegalStateException(e);
		} catch (ParseErrorException e) {
			throw new IllegalStateException(e);
		} catch (MethodInvocationException e) {
			throw new IllegalStateException(e);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
}
