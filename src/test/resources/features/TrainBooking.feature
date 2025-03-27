Feature: Verify Train Booking Functionalities On Ixigo

  Background:
    Given user opens the application
    Then  user clicks on trains

    Scenario: Validate Train Booking features
      Given verify user is on train ticket booking page
      When  user enters departure city "train.departure.city"
      Then  user enters arrival city "train.arrival.city"
      And   user selects departure date "departure.date"
      When  user clicks on search button
      Then  verify train listing page is displayed


