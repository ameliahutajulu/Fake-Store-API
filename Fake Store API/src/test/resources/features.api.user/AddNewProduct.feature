Feature: Add new product
  As a user
  I want to add new product
  So that I can add new products

  Scenario: As a user I can add new product with valid inputs
    Given I set API endpoint for add new product
    When I send request to add new product with valid inputs
    Then I receive status code 200
    And I receive valid data for add new product