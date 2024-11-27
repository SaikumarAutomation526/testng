package com.sai.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo2 {
	
@Test(dataProvider = "testingData")
public void dataprovider(String str1,String str2) throws InterruptedException {
	WebDriver wd=new ChromeDriver();
	wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	wd.manage().window().maximize();
	wd.findElement(By.name("username")).sendKeys(str1);
	wd.findElement(By.name("password")).sendKeys(str2);
	wd.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	wd.close();
}
@DataProvider(name="testingData",parallel = true)
public Object[][] loginData() {
	Object[][] data=new Object[6][2];
	data[0][0]="Admin";
	data[0][1]="admin123";
	
	data[1][0]="Admin";
	data[1][1]="test123";
	
	data[2][0]="Admin1";
	data[2][1]="admin123";
	
	data[3][0]="Admin2";
	data[3][1]="test123";
	
	data[4][0]="Admin1";
	data[4][1]="admin123";
	
	data[5][0]="Admin1";
	data[5][1]="test123";
	 return data;
	
}

}
