package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user opens website")
    public void userOpensWebsite() {
        homePage.openWebApplication();
    }

    @Then("verify user is on homepage")
    public void verifyUserIsOnHomepage() {
        homePage.verifyUserOnHomePage();
    }

    @When("user click the login or signup button")
    public void userClickTheLoginSignupButton() {
        homePage.userClickLoginButton();
    }


    @When("user click more option select Plan")
    public void userClickMoreOptionSelectPlan() {
        homePage.userHoverToMoreOption();
    }

    @And("user click the plan")
    public void userClickThePlan() {
        homePage.userClickPlan();
    }
}
