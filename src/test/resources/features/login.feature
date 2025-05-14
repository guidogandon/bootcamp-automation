Feature: Login

  Scenario: Successful login
    Given the user enter valid credentials
    When the user clicks log in
    Then the inventory should be visible