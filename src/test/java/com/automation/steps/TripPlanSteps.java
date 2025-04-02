package com.automation.steps;

import com.automation.pages.TripPlanPage;
import io.cucumber.java.en.And;

public class TripPlanSteps {

    TripPlanPage tripPlanPage = new TripPlanPage();

    @And("verify user is on tripPlan page")
    public void verifyUserIsOnTripPlanPage() {
        tripPlanPage.verifyUserOnPlanPage();
    }

    @And("user select the from city")
    public void userSelectTheFromCity() {
        tripPlanPage.userSelectFromCity();
    }
}
