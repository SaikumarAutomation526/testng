package com.sai.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariTechPreviewDriverInfo;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class OrangeHRM {
	public WebDriver wd;
	@Parameters("broswerName")
	@BeforeTest
	public void Inialisebroswer(@Optional("Chrome") String str) {
		switch (str) {
		case "Chrome":
			wd=new ChromeDriver();
			break;
		case "Edge":
			wd=new EdgeDriver();
			break;
		case "Firefox":
			wd=new FirefoxDriver();
			break;
		default:
			System.out.println("please provibe correct broswer name");
		}

	}
	@AfterTest
	public void closeThebrowseer() {
		wd.close();
	}
	@Parameters("url")
	@Test
	public void lauchBrowser(String url) {
		wd.get(url);
		wd.manage().window().maximize();
	}
	@Parameters({"username","password"})
	@Test
	public void login(String str1,String str2) {
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		wd.findElement(By.name("username")).sendKeys(str1);
		wd.findElement(By.name("password")).sendKeys(str2);
		wd.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Test
	public void myinfo() {
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	//	wd.findElement(By.xpath("//div[@class='oxd-topbar-header-title']//i")).click();
		wd.findElement(By.xpath("//span[text()='My Info']")).click();
	}
	@Test
	public void verifyDetails() {
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		String str=wd.findElement(By.xpath("//div[@class='orangehrm-edit-employee-name']/h6")).getText();
		String actual="Farhan Khan";
		Assert.assertEquals(str, actual);
	}
	
}
