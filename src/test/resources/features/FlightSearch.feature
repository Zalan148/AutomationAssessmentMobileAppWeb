Feature: FlightSearch
  As a user of Booking.com,
  I want to be able to search for a flight,
  So that I can see the options available to me


  @zalantest
  Scenario: Able to perform a flight search
    Given the Booking.com website is open
    And Flights is selected
    And departure airport is London
    When I enter destination Hong Kong
    And Select dates
    And Select two adults
    And perform a search
    Then the search results are displayed