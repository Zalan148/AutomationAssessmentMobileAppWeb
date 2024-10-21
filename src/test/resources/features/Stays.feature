Feature: Stays
  As a user of Booking.com,
  I want to be able to search for a hotel room,
  So that I can see the options available to me



  @zalantest
  Scenario: Able to perform a hotel search
    Given the Booking.com website is open
    And Stays is selected
    When I enter destination as Las Vegas
    Then the hotel search results are displayed