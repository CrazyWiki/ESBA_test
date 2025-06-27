Feature: Current Location Label Check
  I am a user who wants to verify the current location label
  To ensure that the current location is displayed correctly

  Scenario: Check current location label text
    Given I am on the AccuWeather Main Page
    When I click the search field
    Then Ensure that "Use your current location" is displayed.
