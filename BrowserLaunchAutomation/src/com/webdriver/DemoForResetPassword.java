package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class DemoForResetPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
   String name = "rahul";
  WebDriver driver = new ChromeDriver(); 
  
  // Run on firefox browser 
  //   WebDriver driver = new FirefoxDriver(); 

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  String password = getPassword (driver);
  driver.get("https://rahulshettyacademy.com/locatorspractice/");
  System.out.println(driver.getCurrentUrl());
  System.out.println(driver.getTitle());
 
  /*
  driver.findElement(By.id("inputUsername")).sendKeys("pinturaj92@gmail.com");
  driver.findElement(By.name("inputPassword")).sendKeys("1234");
  driver.findElement(By.className("signInBtn")).click();
  */

  driver.findElement(By.id("inputUsername")).sendKeys(name);
    driver.findElement(By.name("inputPassword")).sendKeys(password);
  driver.findElement(By.className("signInBtn")).click();
  
  Thread.sleep(2000);
  
  System.out.println(driver.findElement(By.tagName("p")).getText());
  Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
  Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
  driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();

  driver.close();
  

	}
	
	//Method for password
	public static String getPassword (WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String [] passwordArray = passwordText.split("'");

        //0th index : Please use temporary password 
		//1st index : 'rahulshettyacademy
		//2nd index : ' to Login.
		String password = passwordArray[1].split("'")[0];
		
		return password;
		
		
	}
	
   
}
