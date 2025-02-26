package com.webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
public class ProjectSpiceJet {
	
	public static void main (String [] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver ();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).click();
		
		// driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[20]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'][normalize-space()='DEL']")).click();
		
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'][normalize-space()='PAT']")).click();

		System.out.println("From Delhi to Patna");
		
		driver.findElement(By.xpath("(//*[name()='circle'])[5]")).click();
		
		Thread.sleep(2000l);
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']")).click();
		System.out.println("Date");
		
		// Click passenger tab
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n']//*[name()='svg']")).click();
	                
        for (int i = 1; i<5; i++)
        {
         driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();
        }
        
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText()
, "5 Adults");
        
        
        // Select money type 
        
        driver.findElement(By.xpath("//div[@style='flex: 0.3 1 0%; margin-left: 10px;']")).click();
        driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='USD']")).click();
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[1]/div[1]/div[1]/div[1]//*[name()='svg']")).click();
        driver.findElement(By.xpath("//div [@data-testid='home-page-flight-cta']")).click();
        
        Assert.assertEquals(driver.findElement(By.xpath("//div [@data-testid='home-page-flight-cta']")).getText(), "Search Flight");
	}

}
	 