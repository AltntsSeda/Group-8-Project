 @Login @Dashboard @NegativeLogin
Feature: Negative Login
  User Story:Verify that as a user I should not be able to login with invalid credentials

  Acceptance Criterias:
  Users should not be able to login with wrong credentials
  Users should not be able to login with blank credentials



  Scenario Outline: Users should not be able to login with wrong credentials
    When the user enter wrong credentials "<Username>" "<Password>"
    And click on login button
    Then the user should see wrong message "<Message>"
    Examples:
      | Username              | Password      | Message                     |
      | wrongUsername         | posmanager    | Wrong login/password        |
      | posmanager15@info.com | wrongPassword | Wrong login/password        |


  Scenario Outline: Users should not be able to login with blank credentials
    When the user enter blank credentials "<Username>" "<Password>"
    And click on login button
    Then the user should see blank message "<Message>"
    Examples:
      | Username              | Password      | Message                     |
      | blank                 | posmanager    | Please fill out this field. |
      | posmanager15@info.com | blank         | Please fill out this field. |

