package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

public class ParentChieldSubchieldExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set <String> windows =driver.getWindowHandles();  //ParentId,ChieldId, SubChield
		Iterator <String>it = windows.iterator();
		String parentid = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		Thread.sleep(3000);
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailId);
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
		
		

	}

}
