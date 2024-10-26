Feature: Carts Limit results
  As a user
  I want to see carts limit results
  So that I can see limit results of product

  Scenario: As a user I can get carts data with valid ID limit
    Given I set API endpoint for get carts limit
    When I send request to get carts limit
    Then I receive status code 200
    And I receive valid data for carts limit