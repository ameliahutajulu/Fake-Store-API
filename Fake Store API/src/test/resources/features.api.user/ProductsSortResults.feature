Feature: Products sort results
  As a user
  I want to see product sort results
  So that I can see sort results of product

  Scenario: As a user I can get products data sort results
    Given I set API endpoint for get products sort results
    When I send request to get products sort results
    Then I receive status code 200
    And I receive valid data for products sort results