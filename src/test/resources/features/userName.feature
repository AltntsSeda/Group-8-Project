@Dashboard
Feature: Username Functionality
  Agile Story: As a user I should be able to see my username on the top menu
  Description:the purpose of this feature is to test the username functionality on the top menu
   @FID-186
  Scenario Outline: Users should be able to see their usernames on the top menu
    When the user enter valid credentials "<Email>" "<Password>"
    Then the user should be able to login see their "<UsernameonTheMenu>" on the top menu
    Examples:
      | Email                      | Password         | UsernameonTheMenu   |
      | salesmanager15@info.com    | salesmanager     | SalesManager15      |
      | posmanager16@info.com      | posmanager       | POSManager16        |
      | imm10@info.com             | inventorymanager | InventoryManager10  |
      | expensesmanager10@info.com | expensesmanager  | ExpensesManager10   |
      | manuf_user10@info.com      | manufuser        | ManufacturingUser10 |