Feature: Products Limit results
  As a user
  I want to see products limit results
  So that I can see limit results of product

  Scenario: As a user I can get products data with valid ID limit
    Given I set API endpoint for get products limit
    When I send request to get products limit
    Then I receive status code 200
    And I receive valid data for products limit