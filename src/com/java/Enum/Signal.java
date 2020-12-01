package com.java.Enum;

public enum Signal {
RED("red"),GREEN("green");
private String action;
Signal(String action) {
this.action=action;
}
public String get() {
	return this.action;
}

}
