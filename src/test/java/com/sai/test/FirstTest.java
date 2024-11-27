package com.sai.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	@Test
	public void testGoogle() throws InterruptedException {
	 WebDriver wd=new ChromeDriver();
	 wd.manage().window().maximize();
	 wd.get("https://www.google.com/");
	 wd.findElement(By.name("q")).sendKeys("testing notes",Keys.ENTER);
	 System.out.println(wd.getTitle());
	 String expected=wd.getTitle();
     Assert.assertEquals(expected, "testing notes - Google Search");
	 Thread.sleep(5000);
	 wd.close();
	}
	@Test
	public void testFaceBook() throws InterruptedException {
		 WebDriver wd=new ChromeDriver();
		 wd.manage().window().maximize();
		 wd.get("https://www.google.com/");
		 wd.findElement(By.name("q")).sendKeys("HYR Tutiorials",Keys.ENTER);
		 System.out.println(wd.getTitle());
		 Thread.sleep(5000);
		 wd.close();
		}


}
