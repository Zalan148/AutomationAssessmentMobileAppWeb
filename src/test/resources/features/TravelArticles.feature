Feature: Travel Articles
  As a user of Booking.com,
  I want to be able to navigate to Travel Articles,
  So that I can read articles on rivers to visit


  @zalantest
  Scenario: Able to access articles on cities   (Negative test)
    Given the Booking.com website is open
    When I select Travel Articles from the menu options
    And select Explore Nature
    Then I am able to read articles on rivers to visit