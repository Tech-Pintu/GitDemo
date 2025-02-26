package com.webdriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
public class PracticeDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000l);
		
		/*
		 * int i =1;
		while (i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		*/
		
		for (int j=1; j<5;j++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
