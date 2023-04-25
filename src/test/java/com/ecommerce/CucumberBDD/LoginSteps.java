/*package com.ecommerce.CucumberBDD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prachiti karwande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.demoblaze.com/index.html#");
	    driver.manage().window().maximize();
	}

	//Regulare exp - \"(.*)\" 
	
	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String userName , String Password) throws InterruptedException {
		  WebElement login = driver.findElement(By.id("login2"));
		  login.click();
		  Thread.sleep(5000);
		  WebElement username = driver.findElement(By.id("loginusername"));
		  username.sendKeys(userName);
		  WebElement password = driver.findElement(By.id("loginpassword"));
		  password.sendKeys(Password);
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginButton.click();
	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_the_home_page() {
	  String title =  driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals("STORE", title);
	}
} */

