Feature: Attractions
  As a user of Booking.com,
  I want to be able to search for attractions for a city and sort by lowest price,
  So that I can see the options available to me


  @zalantest
  Scenario: Able to perform a city attractions search and sort by lowest price
    Given the Booking.com website is open
    And Attractions is selected
    When I enter a city
    And I perform a search
    And sort the search results by lowest price
    Then the attractions search results are displayed by lowest price