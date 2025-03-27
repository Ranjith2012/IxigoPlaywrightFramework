package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Then("verify user is on loginpage")
    public void verifyUserIsOnLoginpage() {
        loginPage.userOnLoginPage();
    }

    @When("user click country code selection option {string}")
    public void userClickCountryCodeSelectionOption(String country) {
        loginPage.userSelectCountryCode(country);
    }

    @Then("verify the country code is selected")
    public void verifyTheCountryCodeIsSelected() {
        loginPage.verifyCountryCode();
    }
}
