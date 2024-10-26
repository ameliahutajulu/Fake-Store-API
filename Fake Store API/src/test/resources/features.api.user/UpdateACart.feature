Feature: Update a cart
  As a user
  I want to update cart
  So that I can update a cart

  Scenario: As a user I can update cart data with valid inputs
    Given I set API endpoint for update cart
    When I send request to update cart with valid inputs
    Then I receive status code 200
    And I receive valid data for updated cart