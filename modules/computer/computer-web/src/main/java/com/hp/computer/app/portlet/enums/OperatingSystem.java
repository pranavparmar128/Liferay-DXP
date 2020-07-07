package com.hp.computer.app.portlet.enums;

public enum OperatingSystem {
	
	WINDOWS("Winodows"), LINUX("Linux"), MAC("MAC");
	
	private OperatingSystem(String value) {
		this.value =  value;
	}
	
	private String value;

	public String getValue() {
		return value;
	}
}
