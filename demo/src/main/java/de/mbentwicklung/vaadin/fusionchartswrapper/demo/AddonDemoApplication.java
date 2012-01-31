package de.mbentwicklung.vaadin.fusionchartswrapper.demo;

import com.vaadin.Application;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Window;

import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Area2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Bar2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Column2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Column3D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Doughnut2D;
import de.mbentwicklung.vaadin.fusionchartswrapper.addon.components.Doughnut3D;
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
		
		layout.addComponent(new Column2D(this));
		layout.addComponent(new Column3D(this));
		layout.addComponent(new Bar2D(this));
		layout.addComponent(new Line(this));
		layout.addComponent(new Area2D(this));
		layout.addComponent(new Pie2D(this));
		layout.addComponent(new Pie3D(this));
		layout.addComponent(new Doughnut2D(this));
		layout.addComponent(new Doughnut3D(this));
		layout.addComponent(new Pareto2D(this));
		layout.addComponent(new Pareto3D(this));
		
		window.setContent(layout);
	}
}
