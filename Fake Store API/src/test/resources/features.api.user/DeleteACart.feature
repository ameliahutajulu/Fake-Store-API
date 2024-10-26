Feature: Delete a cart
  As a user
  I want to delete a cart
  So that I can delete a certain cart

  Scenario: As a user I can delete cart with valid ID
    Given I set API endpoint for delete cart
    When I send request to delete cart with valid ID
    Then I receive status code 200
    And I receive deleted cart data