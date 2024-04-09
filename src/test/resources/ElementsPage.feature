Feature: ElementsPage

  Scenario: Clicking the Click Me button and verifying the displayed message
    Given User navigates to the elements page
    When User clicks on the Buttons element
    And User clicks on the Click Me button
    Then User verifies the displayed message