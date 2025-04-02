package com.automation.utils;

import com.microsoft.playwright.*;

import java.util.ArrayList;
import java.util.List;

public class DriverManger {
    static Playwright playwright;
    static Browser browser;
    static BrowserContext context;
    static Page page;

    public static void createDriver() {
        ArrayList arguments = new ArrayList();
        arguments.add("--start-maximized");
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments));
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        page = context.newPage();
    }

    public static Page getpage() {
        return page;
    }

    public static BrowserContext getContext() {
        return context;
    }

    public static Playwright getDriver() {
        return playwright;
    }
}
