package com.ecommerce.CucumberBDD;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaptopSteps extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	LaptopPage laptoppage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws InterruptedException, IOException {
		TestBase.setUp();
	}

	
	@And("^user logs into application$")
	public void user_logs_into_application() throws InterruptedException, Throwable {
		loginpage = new LoginPage();
	homepage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@And("user click on Laptop category")
	public void user_click_on_laptop_category() throws InterruptedException {
		homepage = new HomePage();
		laptoppage = homepage.clickLaptopCategory();
	}

	@And("user click on MacBook Pro")
	public void user_click_on_mac_book_pro() throws InterruptedException {
		laptoppage = new LaptopPage();
		laptoppage.clickMacBookPro();
	}

	@Then("user click on Add To Cart")
	public void user_click_on_add_to_cart() throws InterruptedException {
		laptoppage = new LaptopPage();
		laptoppage.AddLaptopToCart();
	}

	@Then("user click on Cart")
	public void user_click_on_cart() throws InterruptedException {
		laptoppage = new LaptopPage();
		laptoppage.clickOnCart();
	}

	@Then("user click on Place Order")
	public void user_click_on_place_order() throws InterruptedException {
		laptoppage = new LaptopPage();
		laptoppage.placeOrder();
	}

	@Then("user enters personal details")
	public void user_enters_personal_details(DataTable info) throws InterruptedException {
		
		WebElement name = driver.findElement(By.id("name"));
		WebElement country = driver.findElement(By.id("country"));
		WebElement city = driver.findElement(By.id("city"));
		WebElement card = driver.findElement(By.id("card"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		WebElement purchase = driver.findElement(By.xpath("//button[@class='btn btn-primary' and text()='Purchase']"));
		
		List<Map<String,String>> data = info.asMaps(String.class,String.class);
		name.sendKeys(data.get(0).get("name"));
		country.sendKeys(data.get(0).get("country"));
		city.sendKeys(data.get(0).get("city"));
		card.sendKeys(data.get(0).get("card"));
		month.sendKeys(data.get(0).get("month"));
		year.sendKeys(data.get(0).get("year"));
		purchase.click();
	}

	@Then("user clicks on OK")
	public void user_clicks_on_ok() throws InterruptedException {
		laptoppage = new LaptopPage();
		laptoppage.clickOK();
		TestBase.tearDown();
	}
}

