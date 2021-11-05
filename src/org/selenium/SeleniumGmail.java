package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumGmail {

	
	public static void main(string[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Actions a =new Actions(driver);
		WebElement btnGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		a.contextClick(btnGmail).perform();
		
		
		
		
		
		
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
