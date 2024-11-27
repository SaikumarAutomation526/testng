package com.sai.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
	
@Test(dataProvider = "OneDimensionObject")
public void dataprovider(Object str1) throws InterruptedException {
	System.out.println(str1);
}
@Test(dataProvider = "OneDimensionIntegerObject")
public void dataproviderInteger(Integer str1) throws InterruptedException {
	System.out.println(str1);
}

@Test(dataProvider = "IteratorObject")
public void dataproviderIterator(Object str1) throws InterruptedException {
	System.out.println(str1);
}
@Test(dataProvider = "IteratorObjectArray")
public void dataproviderIteratorObject(Object str1,Object str2) throws InterruptedException {
	System.out.println(str1+""+str2);
}
@DataProvider(name="OneDimensionStringObject")
public String[] loginData() {
	String[] data =new String[] {
		"abcd","xyz","xse"	
	};
	return data;
	
}
@DataProvider(name="OneDimensionIntegerObject")
public Integer[] loginData1() {
	Integer[] data =new Integer[] {
		1,2,3	
	};
	return data;
	
}

@DataProvider(name="OneDimensionObject")
public Object[] loginData2() {
	Object[] data =new Object[] {
		1,2,"raju",89.0	
	};
	return data;
	
}
@DataProvider(name="IteratorObject")
public java.util.Iterator<Object> loginData3() {
	List<Object> li=new ArrayList<Object>();
	li.add("saikumar");
	li.add(123);
	li.add(567);
	return li.iterator();
	
}

@DataProvider(name="IteratorObjectArray")
public java.util.Iterator<Object[]> loginData4() {
	List<Object[]> li=new ArrayList<Object[]>();
	li.add(new Object[] {"raju",123});
	li.add(new Object[] {"raju1",121});
	li.add(new Object[] {"raju3",122});
	return li.iterator();
	
}



}
