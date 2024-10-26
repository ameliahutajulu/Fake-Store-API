@UsersSort
Feature: Users sort results
  As a user
  I want to see user sort results
  So that I can see sort results of user

  Scenario: As a user I can get users data sort results
    Given I set API endpoint for get users sort results
    When I send request to get users sort results
    Then I receive status code 200
    And I receive valid data for users sort results