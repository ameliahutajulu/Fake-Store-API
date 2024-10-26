Feature: Get specific category
  As a user
  I want to get specific category
  So that I can get products in a specific category

  Scenario: As a user I can get products data with specific category
    Given I set API endpoint for get products with specific category
    When I send request to get products with specific category
    Then I receive status code 200
    And I receive valid data for products with specific category