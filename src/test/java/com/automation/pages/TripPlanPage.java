package com.automation.pages;

import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TripPlanPage extends BasePage {

    Locator from;
    Locator fromCity;

    public TripPlanPage() {
        from = page.locator("(//span[contains(@class, 'text-ellipsis')])[1]/following-sibling::*[name()='svg']");
        fromCity = page.getByPlaceholder("Search");
    }

    public void verifyUserOnPlanPage() {
        assertThat(from).isVisible();
    }

    public void userSelectFromCity() {
        from.click();
        fromCity.fill("Ooty");
    }
}
