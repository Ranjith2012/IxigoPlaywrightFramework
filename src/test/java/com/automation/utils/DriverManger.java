package com.automation.utils;

import com.microsoft.playwright.*;

public class DriverManger {
    static Playwright playwright;
    static Browser browser;
    static BrowserContext context;
    static Page page;
    public static void createDriver(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
    }

    public static Page getpage() {
        return page;
    }

    public static BrowserContext getContext(){
        return context;
    }

    public static Playwright getDriver(){
        return playwright;
    }
}
