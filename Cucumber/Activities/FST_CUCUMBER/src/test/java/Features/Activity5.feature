@activity5
Feature: Login Test
  @SmokeTest
  Scenario Outline: Testing Login with Examples
    Given User is on Login page
    When User enters "admin" and "password"
    Then Read the page title and confirmation message
    And Close browser
    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |