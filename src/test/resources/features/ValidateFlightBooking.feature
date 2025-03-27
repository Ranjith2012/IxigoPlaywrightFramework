Feature: validate the login country
  Scenario: verify user can select the different country
    Given user open the application
    Then verify user is  on homepage
    When user click the login or signup button
    Then verify user is on loginpage
    When user click country code selection option "Angola"
    Then verify the country code is selected

