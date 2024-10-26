Feature: Get a single product
  As a user
  I want to get a single product
  So that I can get information about a product

  Scenario: As a user I can get product data with valid ID
    Given I set API endpoint for get product
    When I send request to get product
    Then I receive status code 200
    And I receive valid data for product