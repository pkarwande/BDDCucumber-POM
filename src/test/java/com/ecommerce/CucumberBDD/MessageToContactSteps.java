/*package com.ecommerce.CucumberBDD;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MessageToContactSteps extends TestBase {
	

	LoginPage loginpage ;
	HomePage homepage;
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
		try {
		TestBase.setUp();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("user logs into the app")
	public void user_enters_username_and_password() {
	    try {
	    	loginpage	= new LoginPage();
	homepage =	loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("User is on home page");
	}
	@And("user sends message to contact")
	public void user_clicks_on_contact() {
		try {

	    homepage.sendMessageToContact("test@gmail.com", "George Smith", "Test Message");
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("message is sent to contact")
	public void message_is_sent_to_contact() {
	    
		System.out.println("Message sent");
		TestBase.tearDown();
	}


}*/
