Feature: Search City
  I am a user who wants to search for a city's weather
  To be able tI can see current weather information for that city

  Scenario: Search for a city
    Given I am on the AccuWeather Main Page
    When I input "New York" in the search box
    When I select the first search result with the name "New York"
    Then The city weather page header should contain "New York"