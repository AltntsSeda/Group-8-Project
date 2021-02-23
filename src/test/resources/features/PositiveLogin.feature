@Login @PositiveLogin

Feature: Positive Login

  Agile Story:As a user I should be able to login with valid credentials
  Description: The purpose of this feature is to test the login functionality

  Background: Login with valid credentials
    Given the user is on the login page

  @Manufacturing_User
  Scenario: Login as a Manufacturing_User

    When the user enters the Manufacturing_User information
    Then the user should be able to login

  @Expenses_Manager
  Scenario:  Login as a Expenses_Manager

    When the user enters the Expenses_Manager information
    Then the user should be able to login

  @Inventory_Manager
  Scenario: Login as a Inventory_Manager

    When the user enters the Inventory_Manager information
    Then the user should be able to login

  @Point_of_Sales_Manager
  Scenario: Login as a Point_of_Sales_Manager

    When the user enters the Point_of_Sales_Manager information
    Then the user should be able to login

  @Sales_manager
  Scenario: Login as a Sales_manager

    When the user enters the Sales_manager information
    Then the user should be able to login
