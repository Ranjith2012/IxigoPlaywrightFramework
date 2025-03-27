package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TrainSearchPage extends BasePage{

    Locator trainTicketBookingText;
    Locator fromCityStation;
    Locator toCityStation;
    Locator departureDate;
    Locator searchButton;

    String SELECT_STATION_XPATH = "//p[contains(@class,'body-md') and contains(text(),'%s')]";

    public TrainSearchPage(){
        trainTicketBookingText = page.locator("//h1[contains(text(),'Train Ticket')]");
        fromCityStation = page.locator("//input[@placeholder='Enter Origin']");
        toCityStation = page.locator("//input[@placeholder='Enter Destination']");
        departureDate = page.locator("//div[@data-testid='calendar']");
        searchButton = page.locator("//button[text()='Search']");
    }

    public void isTrainSearchPageDisplayed(){
        assertThat(trainTicketBookingText).isVisible();
    }

    public void enterOrigin(String fromStation){

        String from = ConfigReader.getConfigValue(fromStation);
        fromCityStation.click();
        pause(5000);
        fromCityStation.type(from);


    }

    public void enterDestination(String toStation){
        String to = ConfigReader.getConfigValue(toStation);
        toCityStation.click();
        toCityStation.fill(to);
        page.locator(String.format(SELECT_STATION_XPATH,to)).click();
    }

    public void selectDepartureDate(String date){
        departureDate.click();
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

}
