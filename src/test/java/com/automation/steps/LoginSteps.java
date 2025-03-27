package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Then("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        loginPage.userOnLoginPage();
    }

    @When("user click country code selection option {string}")
    public void userClickCountryCodeSelectionOption(String countryCode) {
        loginPage.userSelectCountryCode(countryCode);
    }

    @Then("verify the country code is selected")
    public void verifyTheCountryCodeIsSelected() {
        loginPage.isCountryCodeSelected();
    }
}
