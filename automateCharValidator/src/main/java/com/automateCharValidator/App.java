package com.automateCharValidator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
    	
    	WebElement insertInput = driver.findElement(By.xpath("/html/body/div/div[3]/form/p[1]/input[1]"));
    	
    	Thread.sleep(3000);
    	
    	insertInput.sendKeys("Aaa123b");
    	
    	WebElement checkInput = driver.findElement(By.xpath("/html/body/div/div[3]/form/p[2]/input"));
    	
    	Thread.sleep(4000);
    	
    	checkInput.click();
  
    }
}
