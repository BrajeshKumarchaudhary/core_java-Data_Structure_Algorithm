package com.java.String.Problems;

public class PersonAddress implements Cloneable {
	private int pinCode;
	private String cityName;

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void setCity(String city) {
		this.cityName = city;
	}

	public int getPincode() {
		return this.pinCode;
	}

	public String getCityName() {
		return this.cityName;
	}
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
	
	
	@Override
	public String toString() {
		return "PersonAddress [pinCode=" + pinCode + ", cityName=" + cityName + "]";
	}
	
}
