Feature: Login
  Background: The browser is open
    Given Launch the browser
    Given Maximize the window
    Given Open automation practice
    Given Navigate to Sign in page

  Scenario: Validate user can't login with invalid credentials
    When User enters "gregg.kassulke@yahoo.com" in email field
    And User enters "m23nm3c0z30whf" in password field
    And User clicks on sing in button
    Then User is logged in
    Then Close the browser