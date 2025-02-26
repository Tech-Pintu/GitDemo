package com.witzeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WitzealWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigcash.live/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		// Enter mobile number and send message to mobile number for download apk.
		driver.findElement(By.id("contact")).sendKeys("8210348771");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		
		// verify the message after successfully sent to mobile
		System.out.println(driver.findElement(By.id("message")).getText());
		Assert.assertEquals(driver.findElement(By.id("message")).getText(), "SMS has been sent to your mobile number.");
		
		//Verify the Send button text
		System.out.println(driver.findElement(By.id("submit")).getText());
		Assert.assertEquals(driver.findElement(By.id("submit")).getText(), "GET APP LINK SMS");
		
		// Verify the add cash offer text.
		System.out.println(driver.findElement(By.id("app-btn-desc")).getText());
		Assert.assertEquals(driver.findElement(By.className("app-btn-desc")).getText(), "Get ₹100 FREE Add Cash Bonus*");



	}

}
