@NegativeLogin
Feature: Negative Login
  Agile Story: As a user I should not be able to login with invalid credentials
  Acceptance Criterias:
  Users should not be able to login with wrong credentials
  Users should not be able to login with blank credentials

  Scenario Outline: Users should not be able to login with wrong credentials
    When the user enter wrong credentials "<Username>" "<Password>"
    Then the user should see wrong message "<Message>"
    Examples:
      | Username              | Password      | Message                     |
      | wrongUsername         | posmanager    | Wrong login/password        |
      | posmanager16@info.com | wrongPassword | Wrong login/password        |


  Scenario Outline: Users should not be able to login with blank credentials
    When the user enter blank credentials "<Username>" "<Password>"
    Then the user should see blank message "<Message>" "<Username>" "<Password>"
    Examples:
      | Username              | Password   | Message                     |
      | -                     | posmanager | Please fill in this field. |
      | posmanager16@info.com | -          | Please fill in this field. |
