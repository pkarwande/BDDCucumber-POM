package com.ecommerce.CucumberBDD;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
	//PageFactory
	@FindBy(id = "loginusername")
	WebElement username;
	
	@FindBy(id = "loginpassword")
	WebElement password;
	
	@FindBy(id = "login2")
	WebElement login;
	
	@FindBy(xpath = "//button[@class='btn btn-primary' and text()='Log in']")
	WebElement loginButton;
	
	public LoginPage()
	{
		//Initialize Page Objects
		PageFactory.initElements(driver, this);
	}
	
	public HomePage doLogin(String uname, String pwd) throws IOException, InterruptedException
	{
		login.click();
		username.sendKeys(uname);
		//Thread.sleep(10000);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
}
