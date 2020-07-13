/*package com.ecommerce.CucumberBDD;



import java.util.List;

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



public class LaptopSteps {
	
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
	public void user_enters_username_and_password(String userName, String Password) throws InterruptedException, Throwable {
		//List<List<String>> data = credentials.asLists();
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

	@And("^user is navigated to home page$")
	public void user_is_navigated_to_the_home_page() {
	  String title =  driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals("STORE", title);
	}
	
	@And("user click on Laptop category")
	public void user_click_on_laptop_category() throws InterruptedException {
		Thread.sleep(2000);
	   WebElement laptopCategory = driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Laptops']"));
	   laptopCategory.click();
	}

	@And("user click on MacBook Pro")
	public void user_click_on_mac_book_pro() throws InterruptedException {
		Thread.sleep(2000);
		WebElement MacBookPro = driver.findElement(By.xpath("//a[@class='hrefch' and text()='MacBook Pro']"));
		MacBookPro.click();
	}

	@Then("user click on Add To Cart")
	public void user_click_on_add_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		WebElement AddtoCart = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']"));
		AddtoCart.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
	}

	@Then("user click on Cart")
	public void user_click_on_cart() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Cart = driver.findElement(By.id("cartur"));
		Cart.click();
	}

	@Then("user click on Place Order")
	public void user_click_on_place_order() throws InterruptedException {
		Thread.sleep(4000);
		WebElement PlaceOrder = driver.findElement(By.xpath("//button[@class='btn btn-success' and text()='Place Order']"));
		PlaceOrder.click();
	}

	@Then("user enters personal details")
	public void user_enters_personal_details() throws InterruptedException {
		Thread.sleep(2000);
	   WebElement name = driver.findElement(By.id("name"));
	   WebElement country = driver.findElement(By.id("country"));
	   WebElement city = driver.findElement(By.id("city"));
	   WebElement card = driver.findElement(By.id("card"));
	   WebElement month = driver.findElement(By.id("month"));
	   WebElement year = driver.findElement(By.id("year"));
	   name.sendKeys("James Willson");
	   country.sendKeys("India");
	   city.sendKeys("Nagpur");
	   card.sendKeys("2345676543");
	   month.sendKeys("July");
	   year.sendKeys("2020");
	   WebElement purchase = driver.findElement(By.xpath("//button[@class='btn btn-primary' and text()='Purchase']"));
	   purchase.click();
	}

	@Then("user clicks on OK")
	public void user_clicks_on_ok() throws InterruptedException {
		Thread.sleep(2000);
		 WebElement ok = driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary' and text()='OK']"));
		 ok.click();
		 driver.quit();
	}




}
*/
