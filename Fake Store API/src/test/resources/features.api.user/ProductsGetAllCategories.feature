Feature: Products Get All Categories
  As a user
  I want to see all products categories
  So that I can see all products categories

  Scenario: As a user I can get all products categories
    Given I set API endpoint for get all products categories
    When I send request to get all products categories
    Then I receive status code 200
    And I receive valid data for all products categories