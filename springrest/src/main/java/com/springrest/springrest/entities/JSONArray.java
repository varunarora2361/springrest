package com.springrest.springrest.entities;

public class JSONArray {
String a;
String b;
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
public JSONArray(String a, String b) {
	super();
	this.a = a;
	this.b = b;
}
@Override
public String toString() {
	return "JSONArray [a=" + a + ", b=" + b + "]";
}


}
