package com.factory.DesignPattern;

import java.util.Arrays;

public class Windows implements OperatingSystem{

	@Override
	public void specification() {

		String speci[]= {"Windows11","RAM16","Graphics-NVIDIA"};
		System.out.println(Arrays.toString(speci));

		
		
	}

	@Override
	public void features() {

		String feat[]= {"Intel","MicroSoft","GUI"};
		System.out.println(Arrays.toString(feat));

		
		
	}

}
