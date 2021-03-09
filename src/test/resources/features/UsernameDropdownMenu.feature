@Basepage @UsernameDropdown
Feature: Username Dropdown Functionality
  Agile Story: As a user I should be able to use all links under the username dropdown
  Description: The purpose of this feature is to test the links under username dropdown on the baseoage

  Scenario Outline: Users should be able to use all links under the username dropdown on the basepage
    When the user login as a "POS Manager" information
    And click on the username on the basepage
    And click on the "<Dropdown Item>"
    Then user should be able to go "<Dropdown Item>" page
    Examples:
      | Dropdown Item       |
      | Documentation       |
      | Support             |
      | Preferences         |
      | My Odoo.com account |
      | Log out             |