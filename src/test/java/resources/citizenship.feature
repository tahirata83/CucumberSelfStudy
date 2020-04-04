Feature: Create Citizenship

  Scenario: Citizenship Creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on Setup on top
    And Click on parameter
    And Click on citizenship
    And Click on plus icon
    And Type the citizenship name "THRcity"
    And Type the shortName "Tcity"
    When Click on save button
    Then "THRcity" should be displayed
    And Remove the data "THRcity"
    Then Verify data is removed "THRcity"


    #    get all the name from table
    #    read one by one
    #    make sure my value is displayed in the table
