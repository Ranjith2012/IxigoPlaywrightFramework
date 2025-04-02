package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage extends BasePage {

    Locator closeButton;
    Locator flights;
    Locator loginButton;
    FrameLocator frame;
    Locator moreOption;
    Locator plan;

    public HomePage() {
        flights = page.locator("//p[@class='body-sm text-xl' and text()='Flights']");
        loginButton = page.locator("//div[@class='bg-white border-b border-neutral-100 !py-0 w-full z-30 xl:w-full px-20 xl:px-0']//button[text()='Log in/Sign up']");
        frame = page.frameLocator("#wiz-iframe-intent");
        moreOption = page.locator("//p[@class=\"body-md text-secondary font-medium\"]");
        plan = page.getByText("Plan").first();
    }

    public void openWebApplication() {
        page.navigate(ConfigReader.getConfigValue("application.url"));
        closeButton = frame.locator("//button[@id='closeButton']");
        //wait for the close Button visible
        closeButton.waitFor();
        if (closeButton.isVisible()) {
            closeButton.click();
        } else {
            System.out.println("Button not found or not visible");
        }
    }

    public void verifyUserOnHomePage() {
        assertThat(flights).isVisible();
    }

    public void userClickLoginButton() {
        loginButton.click();
    }

    public void userHoverToMoreOption() {
        //user click the down arrow for scroll page
        page.keyboard().press("PageDown");
        moreOption.hover();
    }

    public void userClickPlan() {
        Page newPage = page.waitForPopup(() -> {
            plan.click(); // Replace with the actual button selector
        });

        // Wait for the new page to load completely
        newPage.waitForLoadState();
    }

}
