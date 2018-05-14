package com.java9s.designpattern.factory;

public class Motorola implements Mobile{
	private int ramSize;
	private String processor;
	
	public Motorola(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}
}
