package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver driver;
	
	public WebDriver getDriverInstance(){
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		return driver;
	}
	

}
