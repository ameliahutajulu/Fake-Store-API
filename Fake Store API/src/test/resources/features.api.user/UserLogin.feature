@Login
Feature: User Login
  As a user
  I want to login
  So that I can manage users data

  Scenario Outline: As a user I can login with valid credentials
    Given I set API endpoint for login
    When I send request to login with valid username "<username>" and valid password "<password>"
    Then I receive status code 200
    And I receive valid data for login
    Examples:
      |username         |password|
      |mor_2314         |83r5^_|