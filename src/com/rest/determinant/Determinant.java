package com.rest.determinant;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Determinant {

	public Determinant() {
		// TODO Auto-generated constructor stub
	}
	@XmlElement
	private int order;
	@XmlElement
	private double [][] array;
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public double[][] getArray() {
		return array;
	}
	public void setArray(double[][] array) {
		this.array = array;
	}	
}
