Feature: Create Nationality
  Scenario: Nationality Creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on Setup on top
    And Click on parameter
    And Click on Nationality
    And Click on plus icon
    And Type in the Name "THRnationality"
    When Click on save button
    Then "THRnationality" should be displayed
    And Remove the data "THRnationality"
    Then Verify data is removed "THRnationality"