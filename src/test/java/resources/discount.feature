Feature: Create Discount

  Scenario Outline: Discount Creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on Setup on top
    And Click on parameter
    And Click on Discount
    And Click on plus icon
    And Type in the Description "<Description>"
    And Type in the IntegrationCode "<IntegrationCode>"
    And Type in the priority "<priority>"
    When Click on save button
    Then "<Description>" should be displayed
    And Remove the data "<Description>"
    Then Verify data is removed "<Description>"
    Examples:
      | Description | IntegrationCode | priority  |
      | discount1   | d1              | a         |
      | discount2   | d2              | b         |
      | discount3   | d3              | c         |