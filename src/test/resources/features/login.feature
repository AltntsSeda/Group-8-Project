@Login
Feature: Users should be able to login

  @Manufacturing_User
  Scenario: Login as a Manufacturing_User
    Given the user is on the login page
    When the user enters the Manufacturing_User information
    Then the user should be able to login

  @Expenses_Manager
  Scenario:  Login as a Expenses_Manager
    Given the user is on the login page
    When the user enters the Expenses_Manager information
    Then the user should be able to login

  @Inventory_Manager
  Scenario: Login as a Inventory_Manager
    Given the user is on the login page
    When the user enters the Inventory_Manager information
    Then the user should be able to login

  @Point_of_Sales_Manager
  Scenario: Login as a Point_of_Sales_Manager
    Given the user is on the login page
    When the user enters the Point_of_Sales_Manager information
    Then the user should be able to login

  @Sales_manager
  Scenario: Login as a Sales_manager
    Given the user is on the login page
    When the user enters the Sales_manager information
    Then the user should be able to login