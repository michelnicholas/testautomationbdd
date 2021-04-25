Feature: Trello login functionality

  Scenario: User can login to Trello with valid credentials
    Given User goes to the Trello home page
    And User clicks on login link
    When User is on Login page
    And User logins to the trello with valid credentials
    Then User should be able to see Trello boards page
