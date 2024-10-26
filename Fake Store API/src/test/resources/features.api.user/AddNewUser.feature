Feature: Add new user
  As a user
  I want to add new user
  So that I can add new users

  Scenario: As a user I can add new user with valid inputs
    Given I set API endpoint for add new user
    When I send request to add new user with valid inputs
    Then I receive status code 200
    And I receive valid data for add new user