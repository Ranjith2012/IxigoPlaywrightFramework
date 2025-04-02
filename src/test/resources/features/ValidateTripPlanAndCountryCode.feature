Feature: validate the login country

  Scenario: verify user can select the different country

    When user click the login or signup button
    Then verify user is on login page
    When user click country code selection option "country"
    Then verify the country code is selected


    Scenario: validate the offer functionalities
      Given user opens website
      Then verify user is on homepage
      When user click more option select Plan
      And user click the plan
      And verify user is on tripPlan page
      And user select the from city
