Feature: Get Carts in a Date Range
  As a user
  I want to get carts in a date range
  So that I can get carts information in certain date range

  Scenario: As a user I can get carts data with valid date range
    Given I set API endpoint for get carts in date range
    When I send request to get carts in date range
    Then I receive status code 200
    And I receive valid data for carts in date range