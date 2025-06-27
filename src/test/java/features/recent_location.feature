Feature: Recent Location
  I am a user who wants to view recent locations
  To be able to see the weather for my recently searched cities

  Scenario: Search for a city
    Given I am on the AccuWeather Main Page
    When I input "London" in the search box
    When I select the first search result with the name "London"
    Then The city weather page header should contain "London"
    When I go back to the main page using browser navigation
    Then Click first recent location on the Main Page
    Then The city weather page header should contain "London"
