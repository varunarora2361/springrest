package com.springrest.springrest.entities;

import java.io.Serializable;
import java.util.List;

public class Abc {
/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
private String a;
private String b;
public String getA() {
	return a;
}
public void setA(String a) {
	this.a = a;
}
public String getB() {
	return b;
}
public void setB(String b) {
	this.b = b;
}
public Abc() {
	
}

  @Override
public String toString() {
	return "Abc [a=" + a + ", b=" + b + "]";
}

}
