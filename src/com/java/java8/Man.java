package com.java.java8;

import java.util.List;

public class Man {
private int id;
private String name;
private List<String> phones;


public Man(int id, String name, List<String> phones) {
	this.id = id;
	this.name = name;
	this.phones = phones;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
	
	
}
