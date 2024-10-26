@UsersLimit
Feature: Users limit results
  As a user
  I want to see users limit results
  So that I can see limit results of user

  Scenario: As a user I can get users data with valid ID limit
    Given I set API endpoint for get users limit
    When I send request to get users limit
    Then I receive status code 200
    And I receive valid data for users limit