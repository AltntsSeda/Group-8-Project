@Activities
Feature: Activities Link
  Agile Story: As a user I should be able to see Activities link on the top menu
  Description: The purpose of this feature is to test the Activities link functionality on the top menu

  Scenario: Users should be able to see Activities link on the top menu
    When the user enter valid credentials "posmanager16@info.com" "posmanager"
    Then the user should be able to see Activities link on the top menu
