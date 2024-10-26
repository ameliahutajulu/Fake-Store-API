Feature: Get a user carts
  As a user
  I want to get a user carts
  So that I can get information about other user carts

  Scenario: As a user I can get user carts with valid ID
    Given I set API endpoint for get user carts
    When I send request to get user carts
    Then I receive status code 200
    And I receive valid data for user carts