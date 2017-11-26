
Feature: Login into Applicaiton verifying the logine

  Scenario: Verify login with valid data
    Given Open chromebrowser and I should be redirected to Login page
    When Enter user name and password
    And Click on login button
    Then I should be loged into application
