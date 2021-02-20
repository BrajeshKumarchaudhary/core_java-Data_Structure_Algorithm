package com.interview;

public class PersonDemo {

	private static String companyName;
	private int companyId;
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		PersonDemo.companyName = companyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
}
