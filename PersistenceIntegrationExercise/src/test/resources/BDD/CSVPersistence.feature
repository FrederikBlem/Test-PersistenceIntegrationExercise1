Feature: Read data

  Scenario: Display data from CSV file
    Given I have a CSV file
    When The file is opened
    Then I get to read information from the file

  Scenario: Save Data to CSV file
    Given I write updates to the CSV file
    When I save the file after updating
    Then the file changes persist