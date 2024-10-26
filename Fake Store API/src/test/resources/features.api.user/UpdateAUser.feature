Feature: Update a user
  As a user
  I want to update user
  So that I can update a user

  Scenario: As a user I can update user data with valid inputs
    Given I set API endpoint for update user
    When I send request to update user with valid inputs
    Then I receive status code 200
    And I receive valid data for updated user