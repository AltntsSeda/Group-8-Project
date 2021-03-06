@Basepage @UsernameDropdown
Feature: Username Dropdown Functionality
  Agile Story: As a user I should be able to use all links under the username dropdown
  Description: The purpose of this feature is to test the links under username dropdown on the baseoage
  @FID-202
  Scenario Outline: Users should be able to use all links under the username dropdown on the basepage
    When the user enters the "POS Manager" information
    And click on the username on the basepage
    And click on the "<Dropdown Item>"
    Then user should be able to go "<Dropdown Item>" page
    Examples:
      | Dropdown Item       |
      | Documentation       |
      | Support             |
      | My Odoo.com account |
