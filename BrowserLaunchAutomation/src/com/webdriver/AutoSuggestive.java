package com.webdriver;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");  //Now website update so this list items fails to appear.
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000l);
		
		
		List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-ment-item']a"));
		
		for (WebElement option : options)
		{
			if (option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
	}

}
