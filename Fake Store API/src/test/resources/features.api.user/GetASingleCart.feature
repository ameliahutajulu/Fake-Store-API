Feature: Get a single cart
  As a user
  I want to get a single cart
  So that I can get information about a cart

  Scenario: As a user I can get cart data with valid ID
    Given I set API endpoint for get cart
    When I send request to get cart
    Then I receive status code 200
    And I receive valid data for cart