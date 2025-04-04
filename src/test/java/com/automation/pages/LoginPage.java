package com.automation.pages;

import com.microsoft.playwright.Locator;

import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginPage extends BasePage {

    Locator countryCode;
    List<Locator> countryName;
    String selectedCode;

    public LoginPage() {
        countryCode = page.locator("(//div[@role=\"presentation\"])[2]");
    }

    public void userOnLoginPage() {
        assertThat(countryCode).isVisible();
    }

    public void userSelectCountryCode(String country) {
        countryCode.click();
        countryName = page.locator("//div[@data-testid=\"popover-parent\"]//p[@class=\"body-md flex group-[.list-lg]:body-lg text-primary\"]").all();
        //user store the displayed country code for before select the country
        selectedCode = extractCountryCode(countryCode.textContent());
        for (Locator s : countryName) {
            if (s.textContent().contains(country)) {
                System.out.println(s.textContent());
                s.click();
                break;
            }
        }
    }

    public void verifyCountryCode() {
        //store the country code after selecting
        String updatedCode = extractCountryCode(countryCode.textContent());
        //validate the country code
        assert !updatedCode.equals(selectedCode);
    }
}
