@smoke
Feature: Trello login functionality

  Background: 
  Given User goes to the Trello home page
  And User clicks on login link 
  
  @fish
  Scenario: User can login to Trello with valid credentials
    When User is on Login page
    And User logins to the trello with valid credentials
    Then User should be able to see Trello boards page

  @dev 
  Scenario: User cannot login to Trello with invalid credentials 
    When User is on Login page
    And user logins with invalid credentials
    Then user should be able to see an error message 