package com.webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class AlertPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name = "pintu";
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(Name);
		driver.findElement(By.cssSelector("[id ='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		

	}

}
