package de.mbentwicklung.vaadin.fusionchartswrapper.components;

import com.vaadin.terminal.Resource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.ClientWidget;
import com.vaadin.ui.Embedded;

import de.mbentwicklung.vaadin.fusionchartswrapper.components.client.ui.VFusionChart;

/**
 * @author Marc Bellmann
 */
@ClientWidget(VFusionChart.class)
public abstract class FusionChart extends Embedded {

	/** serialVersionUID */
	private static final long serialVersionUID = 4830248025522579621L;

	public FusionChart(final String swfFilePath) {
		this(new ThemeResource(swfFilePath));
	}

	public FusionChart(final Resource chartResource) {
		super(null, chartResource);

		setParameter("FlashVars", "&dataXML=" + getDataAsString());

		setWidth("400px");
		setHeight("400px");
	}

	protected abstract String getDataAsString();

}