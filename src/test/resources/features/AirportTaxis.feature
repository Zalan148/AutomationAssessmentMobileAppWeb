Feature: Airport Taxis
  As a user of Booking.com,
  I want to be able to search for an airport taxi,
  So that I can see the options available to me


  @zalantest
  Scenario: Able to perform an airport taxi search
    Given the Booking.com website is open
    And airport taxis is selected
    When pick up location is entered
    And destination is entered
    And date is entered
    And two passengers is selected
    And an airport taxi search is performed
    Then the airport taxi search results are displayed