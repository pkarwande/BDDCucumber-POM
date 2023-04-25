package com.ecommerce.CucumberBDD;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@class='nav-link' and text()='Contact']")
	WebElement contact;
	
	@FindBy(id = "recipient-email")
	WebElement contactEmail;
	
	@FindBy(id = "recipient-name")
	WebElement contactName;
	
	@FindBy(id = "message-text")
	WebElement contactMessage;
	
	@FindBy(xpath = "//button[@class='btn btn-primary' and text()='Send message']")
	WebElement sendMessage;
	
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Laptops']")
	WebElement laptopCategory;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void sendMessageToContact(String cemail, String cname, String smessage) throws InterruptedException
	{
		
		Thread.sleep(5000);
		contact.click();
		contactEmail.sendKeys(cemail);
		contactName.sendKeys(cname);
		contactMessage.sendKeys(smessage);
		sendMessage.click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public LaptopPage clickLaptopCategory() throws InterruptedException
	{
		Thread.sleep(5000);
		laptopCategory.click();
		
		return new LaptopPage();
	}
}
