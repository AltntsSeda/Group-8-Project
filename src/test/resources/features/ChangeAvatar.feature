@ChangeAv
Feature: Change Avatar
  Agile story: As a user I should be able to change my avatar from the Preferences page
  Description:The purpose of this feature is to test the avatar has been changed from the Preferences page.
  Background:
    When the user enters the "Inventory Manager" information
    Then the user should be able to login



  @FID-196
  Scenario:
    Then click on the username on the basepage
    And the user click "Preferences" button on the UserMenu
    And the user able to click edit sign
    And the user able to click Save button





