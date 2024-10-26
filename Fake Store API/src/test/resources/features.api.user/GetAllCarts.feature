Feature: Get All Carts
  As a user
  I want to get all carts
  So that I can get information of all carts

  Scenario: As a user I can get all carts data
    Given I set API endpoint for get all carts
    When I send request to get all carts
    Then I receive status code 200
    And I receive valid data for all carts