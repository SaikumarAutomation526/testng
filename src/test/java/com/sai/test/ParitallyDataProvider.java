package com.sai.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class ParitallyDataProvider {
	@Test(dataProvider ="partialDataprovider")
	public void testData(String str) {
		System.out.println(str);
	}
	@DataProvider(indices = {0,2},name="partialDataprovider")
	public Object[] dataProvider() {
		Object[] data=new Object[] {
			"saikumar","raju","rani"	
		};
		return data;
	}

}
