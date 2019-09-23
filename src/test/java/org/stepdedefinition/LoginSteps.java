package org.stepdedefinition;

import org.pojo.Locators;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Baseclass {
Locators loc;
@Given("User launches flipkart page")
public void user_launches_flipkart_page() {
	launchBrowser("https://www.flipkart.com/");
    
}

@When("User enters username and password and clicks login button")
public void user_enters_username_and_password_and_clicks_login_button() {
	loc=new Locators();
	fillText(loc.getTxtemail(), "divya");
	fillText(loc.getTxtpassword(), "123");
	clickButton(loc.getBtnLogin());
}

@Then("if user credentials are incorrect, user should not be login to home page")
public void if_user_credentials_are_incorrect_user_should_not_be_login_to_home_page() {
    System.out.println(loc.getMsgInvalidUsername().getText());
}
}
