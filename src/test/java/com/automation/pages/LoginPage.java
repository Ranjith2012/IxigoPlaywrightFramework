package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;

import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginPage extends BasePage {

    Locator countryCode;
    List<Locator> countryName;
    Locator countryCodeText;

    public LoginPage() {
        countryCode = page.locator("(//div[@role=\"presentation\"])[2]");
        countryCodeText = page.locator("(//div[@role='presentation'])[2]");
    }

    public void userOnLoginPage() {
        assertThat(countryCode).isVisible();
    }

    public void userSelectCountryCode(String country) {
        countryCode.click();
        countryName = page.locator("//div[@data-testid=\"popover-parent\"]//p[@class=\"body-md flex group-[.list-lg]:body-lg text-primary\"]").all();
        for (Locator s : countryName) {
            if (s.textContent().contains(ConfigReader.getConfigValue(country))) {
                System.out.println(s.textContent());
                s.click();
                break;
            }
        }
    }

    public void isCountryCodeSelected() {
        assertThat(countryCodeText).hasText(ConfigReader.getConfigValue("country.code"));
    }
}
