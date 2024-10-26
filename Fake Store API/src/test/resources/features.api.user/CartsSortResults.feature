Feature: Carts sort results
  As a user
  I want to see cart sort results
  So that I can sort cart results

  Scenario: As a user I can get carts data sort results
    Given I set API endpoint for get carts sort results
    When I send request to get carts sort results
    Then I receive status code 200
    And I receive valid data for carts sort results