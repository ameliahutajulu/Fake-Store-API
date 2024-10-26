Feature: Add new cart
  As a user
  I want to add new cart
  So that I can add new carts

  Scenario: As a user I can add new cart with valid inputs
    Given I set API endpoint for add new cart
    When I send request to add new cart with valid inputs
    Then I receive status code 200
    And I receive valid data for add new cart