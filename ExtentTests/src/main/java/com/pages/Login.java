package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Login extends Base {
	WebDriver driver;
	@FindBy(how = How.XPATH, using ="//a[text()='Images']")
	WebElement imageLink;
	
	
	
	public Login(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, Login.class);
	}

	
	public boolean isImageLinkPresent(){
		
		return imageLink.isDisplayed();
		
	}
}
