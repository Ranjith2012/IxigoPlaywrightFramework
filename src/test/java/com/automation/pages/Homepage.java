package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Homepage extends BasePage {

    Locator closeButton;
    Locator flights;
    Locator loginButton;
    FrameLocator frame;

    public Homepage() {
        flights     = page.locator("//p[@class='body-sm text-xl' and text()='Flights']");
        loginButton = page.locator("//div[@class='bg-white border-b border-neutral-100 !py-0 w-full z-30 xl:w-full px-20 xl:px-0']//button[text()='Log in/Sign up']");
        frame       = page.frameLocator("#wiz-iframe-intent");
    }

    public void openWebApplication() {
        page.navigate(ConfigReader.getConfigValue("application.url"));
        closeButton = frame.locator("//button[@id='closeButton']");
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
}
