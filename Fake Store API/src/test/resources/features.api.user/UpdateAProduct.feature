Feature: Update a product
  As a user
  I want to update product
  So that I can update a product

  Scenario: As a user I can update product data with valid inputs
    Given I set API endpoint for update product
    When I send request to update product with valid inputs
    Then I receive status code 200
    And I receive valid data for updated product
