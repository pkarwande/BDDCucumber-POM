package com.ecommerce.CucumberBDD;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class LaptopPage extends TestBase {
	
	//PageFactory
	
	@FindBy(xpath = "//a[@class='hrefch' and text()='MacBook Pro']")
	WebElement MacBookPro;
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg' and text()='Add to cart']")
	WebElement AddtoCart;
	
	@FindBy(id = "cartur")
	WebElement Cart;
	
	@FindBy(xpath = "//button[@class='btn btn-success' and text()='Place Order']")
	WebElement PlaceOrder;
	
	@FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary' and text()='OK']")
	WebElement OK;
	

	public LaptopPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickMacBookPro()
	{
	MacBookPro.click();
	}
	
	public void AddLaptopToCart() throws InterruptedException
	{
		AddtoCart.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
	}
	
	public void clickOnCart()
	{
		Cart.click();
	}
	
	public void placeOrder()
	{
		PlaceOrder.click();
	}
	
	public void clickOK()
	{
		 OK.click();
	}
}
