package com.webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChieldORChildToParentLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		
		
		
	}

}
