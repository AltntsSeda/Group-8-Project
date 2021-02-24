Feature: Module Links Functionality Süm
  Agile story: Users should be able to go all modules they have right to access via links on the top menu
  Description: Tests that the user can access all modules with access right through the links in the top menu.

  @tag
  Scenario: Menu Options Manufacturing User
    Given the user logged in as "Manufacturing User"
    Then the user should see following options
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | Website       |
      | Manufacturing |
      | Events        |
      | Employees     |
      | Leaves        |
      | Expenses      |
      | Maintenance   |
      | Dashboards    |


  @tag
  Scenario: Menu Options Expenses Manager
    Given the user logged in as "Expenses Manager"
    Then the user should see following options
      | Discuss   |
      | Calendar  |
      | Notes     |
      | Contacts  |
      | Website   |
      | Events    |
      | Employees |
      | More      |

  @tag
  Scenario: Menu Options Inventory Manager
    Given the user logged in as "Inventory Manager"
    Then the user should see following options
      | Discuss  |
      | Calendar |
      | Notes    |
      | Contacts |
      | Website  |
      | Iventory |
      | More     |

  @tag
  Scenario: Menu Options Point of Sales Manager
    Given the user logged in as "Point of Sales Manager"
    Then the user should see following options
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | CRM           |
      | Sales         |
      | Website       |
      | Point of Sale |
      | More          |


  @tag
  Scenario: Menu Options Sales Manager
    Given the user logged in as "Sales Manager"
    Then the user should see following options
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | CRM           |
      | Sales         |
      | Website       |
      | Point of Sale |
      | More          |
