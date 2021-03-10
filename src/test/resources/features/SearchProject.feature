@SearchProject
Feature: SearchProject Functionality

  Agile Story: As a POS Manager I should be able to search projects with project names by using simple search input box

  Description:POS Manager can search projects with project names by using simple search input box
@FID-198
  Scenario: POS Manager should be able to search projects with project names
    When the user enter valid credentials "posmanager16@info.com" "posmanager"
Then the user should be able to enter valid project name