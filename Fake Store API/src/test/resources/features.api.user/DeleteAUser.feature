Feature: Delete a user
  As a user
  I want to delete a user
  So that I can delete a certain user

  Scenario: As a user I can delete user with valid ID
    Given I set API endpoint for delete user
    When I send request to delete user with valid ID
    Then I receive status code 200
    And I receive deleted user data