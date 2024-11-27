package com.sai.test;

import org.testng.annotations.DataProvider;

public class DataprovidedSeperateClass {
	@DataProvider(name="seperateClass")
	public Object[] testData() {
		Object[] data=new Object[] {
				"hello","welocme","to"
		};
		return data;
	}

}
