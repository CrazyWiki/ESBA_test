Feature: Temperature Unit Coversion
  As a user and I want to change temperature units
  So that I can change measurement system of the weather in settings

Scenario: Change temperature unit to Fahrenheit
  Given I am on the AccuWeather Main Page
  When I click header menu
  When I select Settings from the header menu options
  Then I select Imperial units
  When I go back to the main page using browser navigation
  Then I see that temperature unit to "F"