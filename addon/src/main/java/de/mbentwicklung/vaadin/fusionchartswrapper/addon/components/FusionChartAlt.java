package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;
///**
// * 
// */
//package de.mbentwicklung.vaadin.fusionchartswrapper.addon.components;
//
//import com.vaadin.terminal.Resource;
//import com.vaadin.terminal.ThemeResource;
//import com.vaadin.ui.ClientWidget;
//import com.vaadin.ui.Embedded;
//
//import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.ChartTag;
//
///**
// * @author Marc Bellmann
// */
//@ClientWidget(VFusionChart.class)
//public abstract class FusionChart implements Embedded {
//
//	/** serialVersionUID */
//	private static final long serialVersionUID = 4830248025522579621L;
//
//	private ChartTag chartTag;
//
//	public FusionChart(final String swfFilePath) {
//		this(new ThemeResource(swfFilePath));
//	}
//
//	public FusionChart(final Resource chartResource) {
//		super(null, chartResource);
//
//		setParameter("FlashVars", "&dataXML=<chart>"
//						+ "<set label='Week 1' value='14400' />" 
//						+ "</chart>");
//		// setParameter("FlashVars", "&dataXml=" + getDataAsString());
////		setParameter("FlashVars", "&data=");
//		
//		setWidth("400px");
//		setHeight("400px");
//	}
//
//	@Override
//	public void attach() {
//		super.attach();
//	}
//
//	protected abstract String getDataAsString();
//
//	public ChartTag getChartTag() {
//		return (chartTag == null) ? new ChartTag("", "", "", "", "") : chartTag;
//	}
//
//	public void setChartTag(ChartTag chartTag) {
//		this.chartTag = chartTag;
//	}
//}
