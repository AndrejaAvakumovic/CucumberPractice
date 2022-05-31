Feature: Logout
  Background: The browser is open
    Given Launch the browser
    Given Maximize the window
    Given Open automation practice
    Given Navigate to Sign in page

  Scenario: Validate logged user can logout
    When User enters "comtradeqa7@example.com" in email field
    And User enters "12345" in password field
    And User clicks on sing in button
    Then User is logged in
    Then User clicks on sign out button
    Then User is logged out
    Then Close the browser