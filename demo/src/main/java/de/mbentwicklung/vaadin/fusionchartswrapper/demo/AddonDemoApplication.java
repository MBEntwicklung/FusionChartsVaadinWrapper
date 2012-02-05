package de.mbentwicklung.vaadin.fusionchartswrapper.demo;

import com.vaadin.Application;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Window;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.Data;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Area2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Bar2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Column2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Column3D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Doughnut2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Doughnut3D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.FusionChart;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Line;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Pareto2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Pareto3D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Pie2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Pie3D;

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

		final GridLayout layout = new GridLayout(3, 4);

		layout.addComponent(createColumn2D());
		layout.addComponent(createColumn3D());
		layout.addComponent(createBar2D());
		layout.addComponent(createLine());
		layout.addComponent(createArea2D());
		layout.addComponent(createPie2D());
		layout.addComponent(createPie3D());
		layout.addComponent(createDoughnut2D());
		layout.addComponent(createDoughnut3D());
		layout.addComponent(createPareto2D());
		layout.addComponent(createPareto3D());

		window.setContent(layout);
	}

	private FusionChart createColumn2D() {
		Column2D column2d = new Column2D();
		column2d.addData(createExampleDatas());
		return column2d;
	}

	private FusionChart createColumn3D() {
		Column3D column3d = new Column3D();
		column3d.addData(createExampleDatas());
		return column3d;
	}

	private FusionChart createBar2D() {
		Bar2D bar2d = new Bar2D();
		bar2d.addData(createExampleDatas());
		return bar2d;
	}

	private FusionChart createLine() {
		Line line = new Line();
		line.addData(createExampleDatas());
		return line;
	}

	private FusionChart createArea2D() {
		Area2D area2d = new Area2D();
		area2d.addData(createExampleDatas());
		return area2d;
	}

	private FusionChart createPie2D() {
		Pie2D pie2d = new Pie2D();
		pie2d.addData(createExampleDatas());
		return pie2d;
	}

	private FusionChart createPie3D() {
		Pie3D pie3d = new Pie3D();
		pie3d.addData(createExampleDatas());
		return pie3d;
	}

	private FusionChart createDoughnut2D() {
		Doughnut2D doughnut2d = new Doughnut2D();
		doughnut2d.addData(createExampleDatas());
		return doughnut2d;
	}

	private FusionChart createDoughnut3D() {
		Doughnut3D doughnut3d = new Doughnut3D();
		doughnut3d.addData(createExampleDatas());
		return doughnut3d;
	}

	private FusionChart createPareto2D() {
		Pareto2D pareto2d = new Pareto2D();
		pareto2d.addData(createExampleDatas());
		return pareto2d;
	}

	private FusionChart createPareto3D() {
		Pareto3D pareto3d = new Pareto3D();
		pareto3d.addData(createExampleDatas());
		return pareto3d;
	}

	private Data[] createExampleDatas() {
		final Data[] datas = new Data[] { new Data("data 1", 15),
				new Data("data 2", 20), new Data("data 3", 10),
				new Data("data 4", 12), new Data("data 5", 10),
				new Data("data 6", 5), };
		return datas;
	}
}
