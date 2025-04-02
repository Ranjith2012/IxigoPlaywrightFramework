package com.automation.steps;

import com.automation.pages.TrainSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrainBookingSteps {

    TrainSearchPage trainSearchPage = new TrainSearchPage();

    @Given("verify user is on train ticket booking page")
    public void verifyUserIsOnTrainTicketBookingPage() {
        trainSearchPage.isTrainSearchPageDisplayed();
    }

    @When("user enters departure city {string}")
    public void userEntersDepartureCity(String fromStation) {
        trainSearchPage.enterOrigin(fromStation);
    }

    @Then("user enters arrival city {string}")
    public void userEntersArrivalCity(String arg0) {
    }

    @And("user selects departure date {string}")
    public void userSelectsDepartureDate(String arg0) {
    }

    @When("user clicks on search button")
    public void userClicksOnSearchButton() {
    }

    @Then("verify train listing page is displayed")
    public void verifyTrainListingPageIsDisplayed() {
    }


}
