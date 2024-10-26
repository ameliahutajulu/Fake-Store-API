Feature: Delete a product
  As a user
  I want to delete a product
  So that I can delete a certain product

  Scenario: As a user I can delete product with valid ID
    Given I set API endpoint for delete product
    When I send request to delete product with valid ID
    Then I receive status code 200
    And I receive deleted product data