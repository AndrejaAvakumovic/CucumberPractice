  Feature: Login
  Background: The browser is open
  Given Launch the browser
  Given Maximize the window
  Given Open automation practice
  Given Navigate to Sign in page
    Given User loges in
    Given Navigate to Home page


  Scenario: Validate user's order is completed
    When User clicks on item picture
    And User clicks on Add to cart button
    And User clicks on proceed to checkout  button at pop-up
    And User clicks on proceed to checkout button at summary
    And User clicks on proceed to checkout button at address
    And User clicks on checkButton at shipping
    And User clicks on proceed to checkout button at shipping
    And User clicks on pay by bank wire at payment
    And User clicks on confirm button
    Then Order is completed
    Then Close the browser


