package com.automation.steps;

import com.automation.pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomeSteps {

    Homepage homepage =  new Homepage();

    @Given("user opens the application")
    public void userOpensTheApplication() {
        homepage.openWebApplication();
    }
    @Then("verify user is  on homepage")
    public void verifyUserIsOnHomepage() {
        homepage.verifyUserOnHomePage();
    }

    @When("user click the login or signup button")
    public void userClickTheLoginSignupButton() {
        homepage.userClickLoginButton();
    }



}
