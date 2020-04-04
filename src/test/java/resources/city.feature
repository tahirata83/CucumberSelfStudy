Feature: Create City
  @Regression
  Scenario Outline: City Creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on Setup on top
    And Click on parameter
    And Click on City
    And Click on plus icon
    And Type in the Name "<THRcity>"
    And Choose any value from dropdown
    When Click on save button
    Then "<THRcity>" should be displayed
    And Remove the data "<THRcity>"
    Then Verify data is removed "<THRcity>"

    Examples:
      | THRcity|
      | city1  |
      | city2  |
      | city3  |