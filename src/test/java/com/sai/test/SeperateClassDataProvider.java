package com.sai.test;

import org.testng.annotations.Test;

public class SeperateClassDataProvider {
  

@Test(dataProviderClass = DataprovidedSeperateClass.class,dataProvider = "seperateClass")
	public void seperateClassData(String str) {
		System.out.println(str);
	}
}
