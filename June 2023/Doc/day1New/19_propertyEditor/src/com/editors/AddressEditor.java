/**
 * 
 */
package com.editors;

import java.beans.PropertyEditorSupport;

import com.entity.Address;

 
public class AddressEditor extends PropertyEditorSupport {
	private String[] strAddressData;
	private Address address;
	 
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if( text != null) {
			strAddressData = text.split(",");
			if( strAddressData.length != 3) {
				throw new IllegalArgumentException("Address should have House No,Street,City");
			}
		} else {
			throw new IllegalArgumentException("Address should have House No,Street,City");
		}
	}
	
	 
	@Override
	public Object getValue() {
		return new Address(strAddressData[0],strAddressData[1],strAddressData[2]);
	}
	 
	@Override
	public void setValue(Object value) {
		 address = (Address) value;
	}
	 
	@Override
	public String getAsText() {
		StringBuffer strAddress = new StringBuffer();
		strAddress.append(address.getHouseNo());
		strAddress.append(",");
		strAddress.append(address.getStreet());
		strAddress.append(",");
		strAddress.append(address.getCity());
		return super.getAsText();
	}
}
