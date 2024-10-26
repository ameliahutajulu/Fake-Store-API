Feature: Get All Users
  As a user
  I want to get all users
  So that I can get information of all users

  Scenario: As a user I can get all users data
    Given I set API endpoint for get all users
    When I send request to get all users
    Then I receive status code 200
    And I receive valid data for all users
