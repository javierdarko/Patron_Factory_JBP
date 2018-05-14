package com.java9s.designpattern.factory;

public class Huawei implements Mobile{
	private int ramSize;
	private String processor;
	
	public Huawei(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}
}
