@PositiveLogin

Feature: Positive Login

  Agile Story:As a user I should be able to login with valid credentials
  Description: The purpose of this feature is to test the login functionality

  @Manufacturing_User
  Scenario Outline: Login as a Manufacturing_User
    When the user enters the "<User Type>" information
    Then the user should be able to login
    Examples:
      | User Type              |
      | Manufacturing_User     |
      | Expenses_Manager       |
      | Inventory_Manager      |
      | Point_of_Sales_Manager |
      | Sales_manager          |

  @POSManagerLogin
  Scenario: Users should be able to login with valid credentials
    When the user enter valid credentials "posmanager16@info.com" "posmanager"
    Then the user should be able to login