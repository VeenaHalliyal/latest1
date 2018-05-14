package com.practice.jenkins.May12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void test2() throws InterruptedException{
	String key="webdriver.gecko.driver";
	String value="./Softwares/geckodriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	WebElement ele=driver.findElement(By.xpath("//span[.='Men']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[.='T-Shirts']")).click();
	}
}
