package com.factory.DesignPattern;

import java.util.Arrays;

public class Android implements OperatingSystem{

	@Override
	public void specification() {

		String speci[]= {"Xiaomi Redmi 12 5G","Processor: Qualcomm Snapdragon 4 Gen 2","RAM: 4 GB"};
		System.out.println(Arrays.toString(speci));

		
		
	}

	@Override
	public void features() {

		String feat[]= {"Xiaomi Redmi 12 5G","Camera: Dual Camera","Storage: 128 GB, 256 GB"};
		System.out.println(feat);

		
		
	}


}
