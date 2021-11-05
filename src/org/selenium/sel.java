package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel {
	public static void main(String[]args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.oracle.com/java/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();		
		driver.close();
		driver.quit();
		
	}	
	
}
