Feature: validate the login country

  Scenario: verify user can select the different country
    Given user opens the application
    Then verify user is  on homepage
    When user click the login or signup button
    Then verify user is on login page
    When user click country code selection option "country.code"
    Then verify the country code is selected

