package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelDay5 {
	
		public static void main(String[]args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			Actions a = new Actions(driver);
			//WebElement source = driver.findElement(By.id("credit2"));
			//WebElement destination = driver.findElement(By.id("bank"));
			//Thread.sleep(3000);
			
			//a.dragAndDrop(source, destination).perform();
			
			WebElement btnGmail = driver.findElement(By.xpath("//a[text()=['Gmail']"));
			a.contextClick(btnGmail).perform();
	
	
	
	}
		
	
		
	}


