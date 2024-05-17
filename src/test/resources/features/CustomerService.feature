Feature: Customer Service
  As a user of Booking.com,
  I want to be able to navigate to Customer Service,
  So that I can get help for flights


  @zalantest
  Scenario: Able to access Customer Service
    Given the Booking.com website is open
    When I select Contact Customer Service from the menu options
    And select Frequently Asked Questions for flights
    And select Baggage and seats
    Then FAQs for Baggage and seats is displayed