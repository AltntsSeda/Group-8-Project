@Avatar
Feature: Avatar Functionality
  Agile Story: As a user I should be able to see my avatar on the top menu
  Description:the purpose of this feature is to test the avatar functionality on the top menu

  Scenario Outline: Users should be able to see their avatars on the top menu
    When the user enter valid credentials "<Email>" "<Password>"
    Then the user should be able to see their "<AvataronTheMenu>" on the top menu
    Examples:
      | Email                      | Password         | AvataronTheMenu   |
      | salesmanager15@info.com    | salesmanager     | SalesManager15      |
      | posmanager10@info.com      | posmanager       | POSManager10        |
      | imm10@info.com             | inventorymanager | InventoryManager10  |
      | expensesmanager10@info.com | expensesmanager  | ExpensesManager10   |
      | manuf_user10@info.com      | manufuser        | ManufacturingUser10 |