
Feature: User Module Links

  Agile Story: As a user I should be able to see all modules which I have right to access on the top menu
  Description: The purpose of this feature is to test the all modules that have right access for each user

  @salesmanager
  Scenario: Sales manager should be able to see all modules which he/she has right to access on the top menu

    Given the user logged in as "sales manager"
    Then  the user should see following modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | CRM             |
      | Website         |
      | Point of Sale   |
      | Purchases       |
      | Inventory       |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Maintenance     |
      | Dashboards      |


  @posmanager
  Scenario: Pos manager should be able to see all modules which he/she has right to access on the top menu

    Given the user logged in as "pos manager"
    Then  the user should see following modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | CRM             |
      | Sales           |
      | Website         |
      | Point of Sale   |
      | Purchases       |
      | Inventory       |
      | Manufacturing   |
      | Repairs         |
      | Project         |
      | Events          |
      | Surveys         |
      | Employees       |
      | Attendances     |
      | Leaves          |
      | Expenses        |
      | Maintenance     |
      | Fleet           |
      | Dashboards      |


  @inventorymanager
  Scenario: Inventory manager should be able to see all modules which he/she has right to access on the top menu

    Given the user logged in as "inventory manager"
    Then  the user should see following modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | Website         |
      | Inventory       |
      | Manufacturing   |
      | Repairs         |
      | Invoicing       |
      | Timesheets      |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Lunch           |
      | Maintenance     |
      | Dashboards      |


  @expensesmanager
  Scenario: Expenses manager should be able to see all modules which he/she has right to access on the top menu

    Given the user logged in as "expenses manager"
    Then  the user should see following modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | Website         |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Lunch           |
      | Maintenance     |
      | Dashboards      |


  @manufacturinguser
  Scenario: Manufacturing user should be able to see all modules which he/she has right to access on the top menu

    Given the user logged in as "manufacturing user"
    Then  the user should see following modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | Website         |
      | Manufacturing   |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Maintenance     |
      | Dashboards      |


