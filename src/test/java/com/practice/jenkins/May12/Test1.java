package com.practice.jenkins.May12;

import org.testng.annotations.*;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Test1 {
	
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
	String key="webdriver.gecko.driver";
	String value="./Softwares/geckodriver.exe";
	System.setProperty(key, value);
	 
	driver=new FirefoxDriver();
	/*	String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		 
		driver=new ChromeDriver();*/
		
		
	driver.get("https://en-gb.facebook.com/login/");
	driver.manage().window().maximize();
	
	}
	@Test
	public void testLogin() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("testlogin567@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("qspiders123");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
	AssertJUnit.assertEquals(title, "Facebook");
	System.out.println("statement after assert");
	}

@AfterMethod
public void closeAppln() throws InterruptedException
{
Thread.sleep(5000);
	driver.quit();
}
}