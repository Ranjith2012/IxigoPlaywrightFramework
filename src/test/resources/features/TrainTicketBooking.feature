Feature: Verify train ticket booking functionalities on Ixigo

  Background:
    Given user opens website
    Then  verify user is on homepage

  Scenario: Validate train ticket booking
    When user clicks on trains tab
    Then verify user is on train search page
    And  user enters departure station "train.departure.station"
    Then user enters arrival station "train.arrival.station"
    And  user selects departure date "train.departure.date"
    Then user clicks on search button
