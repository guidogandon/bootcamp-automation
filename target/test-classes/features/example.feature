Feature: Water

  Scenario: Drink some water
    Given the user has 2 liters of water
    When the user drinks 1 liters
    Then the user should have 1 liters left

  Scenario: Drink some more water
    Given the user has 2 liters of water
    When the user drinks 2 liters
    Then the user should have 1 liters left