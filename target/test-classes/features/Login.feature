Feature: Login
  Background: The browser is open
    Given Launch the browser
    Given Maximize the window
    Given Open automation practice
    Given Navigate to Sign in page

  Scenario: Validate user can login with valid credentials
    When User enters "comtradeqa7@example.com" in email field
    And User enters "12345" in password field
    And User clicks on sing in button
    Then User is logged in
    Then Close the browser