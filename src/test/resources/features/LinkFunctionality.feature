Feature: Module Links Functionality Süm
  Agile story: Users should be able to go all modules they have right to access via links on the top menu
  Description: Tests that the user can access all modules with access right through the links in the top menu.

  @tag
  Scenario Outline: check modules <title>
    Given the user enters the "Inventory Manager" information
    When the user navigate to "<module>"
    Then the user should get "<title>"
    Examples:

      | module        | title                               |
      | Discuss       | #Inbox - Odoo                       |
      | Calendar      | Meetings - Odoo                     |
      | Notes         | Notes - Odoo                        |
      | Contacts      | Contacts - Odoo                     |
      | Website       | Login \| Best solution for startups |
      | Inventory     | Inventory - Odoo                    |
      | Manufacturing | Manufacturing Orders - Odoo         |
      | Repairs       | Repair Orders - Odoo                |
      | Invoicing     | Customer Invoices - Odoo            |
      | Timesheets    | My Timesheets - Odoo                |
      | Employees     | Employees - Odoo                    |
      | Leaves        | Leaves Summary - Odoo               |
      | Expenses      | My Expenses to Submit - Odoo        |
      | Lunch         | New Order - Odoo                    |
      | Maintenance   | Maintenance Teams - Odoo            |
      | Dashboards    | My Dashboard - Odoo                 |


