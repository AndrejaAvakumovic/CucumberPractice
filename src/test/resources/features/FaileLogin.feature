Feature: Fail login

  Background: The browser is open
    Given Launch the browser
    Given Maximize the window
    Given Open automation practice
    Given Navigate to Sign in page

    Scenario: Validate user can't login with invalid credentials
      When User enters "<email>" in email field
      And User enters "<password>" in password field
      And User clicks on sing in button
      Then Error message is displayed "<someMessage>"
      Then Close the browser

      Examples:
      | email | password  | someMessage |
      | nekiemail@fakeemail.com | losasifra | There is 1 error\nAuthentication failed.  |
      |                         | password  | There is 1 error\nAn email address required.  |
      | somemail@fakemail.com   |           | There is 1 error\nPassword is required. |
