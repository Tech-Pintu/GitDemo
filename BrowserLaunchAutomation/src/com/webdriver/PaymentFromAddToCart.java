package com.webdriver;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PaymentFromAddToCart {
	//video 
	public static void main( String []args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		String [] itemsNeeded = { "Cucumber", "Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        additems(driver,itemsNeeded);
        
        driver.findElement(By.cssSelector("img[alt='cost']")).click();
        
        driver.findElement(By.xpath("\\button[Contains(text(),'PROCEED TO CHECKOUT')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
        		
        	driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
        	driver.findElement(By.cssSelector("button.promoBtn")).click();
        	
        	//explicit wait
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("Span.promoinfo")));
        	System.out.println(driver.findElement(By.cssSelector("Span.promoinfo")).getText());
        	
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
