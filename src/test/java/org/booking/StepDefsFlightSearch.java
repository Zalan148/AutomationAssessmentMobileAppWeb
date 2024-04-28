package org.booking;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.FlightSearchPage;

//import static org.booking.Hooks.androidDriver;  can use this instead of Hooks.

public class StepDefsFlightSearch {

    FlightSearchPage flightSearchPage = new FlightSearchPage();

    @Given("the Booking.com website is open")
    public void theBookingComWebsiteIsOpen() {
        flightSearchPage.bookingSiteOpen();

    }

    @And("departure airport is London")
    public void departureAirportIsLondon() {
        flightSearchPage.departureLondon();
    }

    @When("I enter destination Hong Kong")
    public void iEnterDestinationHongKong() {
        flightSearchPage.destinationHongKong();
    }

    @And("Select dates")
    public void selectDates() {
        flightSearchPage.selectDates();
    }

    @And("Select two adults")
    public void selectTwoAdults() {
        flightSearchPage.selectTwoAdults();
    }

    @And("perform a search")
    public void performASearch() {
        flightSearchPage.performSearch();
    }

    @Then("the search results are displayed")
    public void theSearchResultsAreDisplayed() throws InterruptedException {
        Thread.sleep(10000);
        Thread.sleep(10000);
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//div[1]/div/button/div/div[2]/div/button/span[@class='Button-module__text___YLOOX'][text()='View details ']")).isDisplayed());

    }

    @And("Flights search is displayed")
    public void flightsSearchIsDisplayed() {
        flightSearchPage.flightSearchDisplayed();

    }
}
