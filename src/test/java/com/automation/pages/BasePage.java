package com.automation.pages;

import com.automation.utils.DriverManger;
import com.microsoft.playwright.Page;

public abstract class BasePage {

    Page page;

    BasePage() {
        page = DriverManger.getpage();
    }

    public void pause(long val) {
        try {
            Thread.sleep(val);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String extractCountryCode(String text) {
        if (text != null && text.contains("+")) {
            return text.substring(text.indexOf("+")); // Extract from '+'
        }
        return text;
    }

}
