package com.automation.steps;

import com.automation.pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    Homepage homepage =  new Homepage();

    @Given("user open the application")
    public void user_open_the_application() {
        homepage.openWebApplication();
    }
    @Then("verify user is  on homepage")
    public void verify_user_is_on_homepage() {
        homepage.verifyUserOnHomePage();
    }

    @When("user click the login or signup button")
    public void userClickTheLoginSignupButton() {
        homepage.userClickLoginButton();
    }

}
