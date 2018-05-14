package com.java9s.designpattern.factory;

public class MobileFactory {
	public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new IPhone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung("Intel");
		}else if(type.equals(Mobile.MOTOROLA)){
			return new Motorola(8,"Adreno");
                }else if(type.equals(Mobile.XIAOMI)){
			return new Xiaomi(5,"Qualcomm SnapDragon");
                }else if(type.equals(Mobile.HUAWEI)){
			return new Huawei(9,"Mali");
                }else {
			return null;
		}