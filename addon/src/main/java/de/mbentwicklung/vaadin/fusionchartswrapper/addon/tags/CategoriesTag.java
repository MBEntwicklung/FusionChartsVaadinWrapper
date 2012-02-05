/**
 * 
 */
package de.mbentwicklung.vaadin.fusionchartswrapper.addon.tags;

import java.util.Arrays;
import java.util.List;

/**
 * @author marc
 * 
 */
public class CategoriesTag {

	private final List<CategoryTag> categories;

	public CategoriesTag(List<CategoryTag> categories) {
		this.categories = categories;
	}

	public CategoriesTag(CategoryTag... categories) {
		this.categories = Arrays.asList(categories);
	}

	public List<CategoryTag> getCategories() {
		return categories;
	}

}
