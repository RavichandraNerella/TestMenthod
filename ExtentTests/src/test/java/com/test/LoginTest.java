package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;

import junit.framework.Assert;

public class LoginTest {
	Base base = new Base();
	WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	  
	 driver = base.getDriverInstance();
	  driver.get("https://www.google.co.in/");
  }

  @Test
  public void imageTest() {
	  
	  Login login = new Login(driver);
	  Assert.assertTrue(login.isImageLinkPresent());
  }
  
  
  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
