/**
 * 
 */
package com.editors;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.entity.Address;
 
public class Registrar implements PropertyEditorRegistrar {

	 
	public void registerCustomEditors(PropertyEditorRegistry registry) {
	 	registry.registerCustomEditor(Address.class, new AddressEditor());
	}

}
