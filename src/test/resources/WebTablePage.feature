Feature: WebTables functionality

  Scenario: Adding and editing a new record in web tables
    Given User navigates to the web table page
    When User clicks on the ADD button
    And User adds a new record
    And User edits the added record
    Then User verifies the edited record
