package com.webdriver;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class AddToCartFunctionTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[]itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		additems(driver,itemsNeeded);
		
		System.out.println("Exicute");

	}
	
	public static void additems (WebDriver driver, String[]itemsNeeded)
	{
		int j= 0;
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i =0; i<products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			
			String formattedName = name[0].trim();
			
			List itemNeddedList = Arrays.asList(itemsNeeded);
			
			if (itemNeddedList.contains(formattedName))
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if (j== itemsNeeded.length)
				{
					break;
				}
			}
			
			
			
			
			
		}
		
	}
      
}
