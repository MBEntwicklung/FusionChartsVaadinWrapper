package de.mbentwicklung.vaadin.fusionchartswrapper.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vaadin.Application;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Area2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Bar2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Column2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Column3D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Doughnut2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Doughnut3D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.FusionChart;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Line;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.MSArea;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Pareto2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Pareto3D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Pie2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Pie3D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.CategoryTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.DataTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.DatasetTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.LineTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.SetTag;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags.VLineTag;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class AddonDemoApplication extends Application {
	private Window window;

	@Override
	public void init() {
		window = new Window("My Vaadin Application");
		setMainWindow(window);

		final VerticalLayout mainLayout = new VerticalLayout();
		final GridLayout singleSeriesCharts = new GridLayout(3, 4);

		singleSeriesCharts.addComponent(createColumn2D());
		singleSeriesCharts.addComponent(createColumn3D());
		singleSeriesCharts.addComponent(createBar2D());
		singleSeriesCharts.addComponent(createLine());
		singleSeriesCharts.addComponent(createArea2D());
		singleSeriesCharts.addComponent(createPie2D());
		singleSeriesCharts.addComponent(createPie3D());
		singleSeriesCharts.addComponent(createDoughnut2D());
		singleSeriesCharts.addComponent(createDoughnut3D());
		singleSeriesCharts.addComponent(createPareto2D());
		singleSeriesCharts.addComponent(createPareto3D());
		mainLayout.addComponent(singleSeriesCharts);

		final GridLayout multiSeriesCharts = new GridLayout(3, 4);
		multiSeriesCharts.addComponent(createMSArea());
		mainLayout.addComponent(multiSeriesCharts);

		final GridLayout stackedCharts = new GridLayout(3, 4);
		mainLayout.addComponent(stackedCharts);

		final GridLayout scrollCharts = new GridLayout(3, 4);
		mainLayout.addComponent(scrollCharts);

		final GridLayout otherCharts = new GridLayout(3, 4);
		mainLayout.addComponent(otherCharts);

		window.setContent(mainLayout);
	}

	/*
	 * Single Series Charts
	 */

	private FusionChart createColumn2D() {
		Column2D column2d = new Column2D();
		column2d.addData(createExampleDatas());
		column2d.addTrendLine(createTrendlines());
		return column2d;
	}

	private FusionChart createColumn3D() {
		Column3D column3d = new Column3D();
		column3d.addData(createExampleDatas());
		column3d.addTrendLine(createTrendlines());
		return column3d;
	}

	private FusionChart createBar2D() {
		Bar2D bar2d = new Bar2D();
		bar2d.addData(createExampleDatas());
		bar2d.addTrendLine(createTrendlines());
		return bar2d;
	}

	private FusionChart createLine() {
		Line line = new Line();
		line.addData(createExampleDatas());
		line.addTrendLine(createTrendlines());
		return line;
	}

	private FusionChart createArea2D() {
		Area2D area2d = new Area2D();
		area2d.addData(createExampleDatas());
		area2d.addTrendLine(createTrendlines());
		return area2d;
	}

	private FusionChart createPie2D() {
		Pie2D pie2d = new Pie2D();
		pie2d.addData(createExampleDatas());
		pie2d.addTrendLine(createTrendlines());
		return pie2d;
	}

	private FusionChart createPie3D() {
		Pie3D pie3d = new Pie3D();
		pie3d.addData(createExampleDatas());
		pie3d.addTrendLine(createTrendlines());
		return pie3d;
	}

	private FusionChart createDoughnut2D() {
		Doughnut2D doughnut2d = new Doughnut2D();
		doughnut2d.addData(createExampleDatas());
		doughnut2d.addTrendLine(createTrendlines());
		return doughnut2d;
	}

	private FusionChart createDoughnut3D() {
		Doughnut3D doughnut3d = new Doughnut3D();
		doughnut3d.addData(createExampleDatas());
		doughnut3d.addTrendLine(createTrendlines());
		return doughnut3d;
	}

	private FusionChart createPareto2D() {
		Pareto2D pareto2d = new Pareto2D();
		pareto2d.addData(createExampleDatas());
		pareto2d.addTrendLine(createTrendlines());
		return pareto2d;
	}

	private FusionChart createPareto3D() {
		Pareto3D pareto3d = new Pareto3D();
		pareto3d.addData(createExampleDatas());
		pareto3d.addTrendLine(createTrendlines());
		return pareto3d;
	}

	private LineTag[] createTrendlines() {
		final LineTag[] lineTags = new LineTag[] { new LineTag(17, "00cc00",
				"Average") };
		return lineTags;
	}

	private DataTag[] createExampleDatas() {
		final DataTag[] datas = new DataTag[] { new SetTag("data 1", 15),
				new SetTag("data 2", 20), new SetTag("data 3", 10),
				new SetTag("data 4", 12), new VLineTag("FF5904", 1),
				new SetTag("data 5", 10), new SetTag("data 6", 5), };
		return datas;
	}

	/*
	 * Multi Series Charts
	 */

	private FusionChart createMSArea() {
		MSArea msArea = new MSArea();
		msArea.setTrendlines(Arrays.asList(createTrendlines()));
		msArea.setCategories(createCategoryTags());
		msArea.setDatasets(createDatasetTags());
		return msArea;
	}

	private List<CategoryTag> createCategoryTags() {
		final List<CategoryTag> categories = new ArrayList<CategoryTag>();
		categories.add(new CategoryTag("A"));
		categories.add(new CategoryTag("B"));
		categories.add(new CategoryTag("C"));
		return categories;
	}

	private List<DatasetTag> createDatasetTags() {
		final List<DatasetTag> categories = new ArrayList<DatasetTag>();
		categories.add(new DatasetTag("data 1", new SetTag(10), new SetTag(15),
				new SetTag(12)));
		categories.add(new DatasetTag("data 2", new SetTag(4), new SetTag(23),
				new SetTag(5)));
		return categories;
	}
}
