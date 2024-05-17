package org.booking;

import common.ElementPresenceWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.FlightSearchPage;

public class FlightSearchStepDefs {

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
    public void selectDates() throws InterruptedException {
        flightSearchPage.selectDates();
    }

    @And("Select two adults")
    public void selectTwoAdults() {
        flightSearchPage.selectTwoAdults();
    }

    @And("perform a search")
    public void performASearch() throws InterruptedException {
        flightSearchPage.performSearch();
        Thread.sleep(15000);
    }

    @Then("the search results are displayed")
    public void theSearchResultsAreDisplayed(){
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//button[@aria-label='View details  ']")));
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//button[@aria-label='View details  ']")).isDisplayed());

    }

    @And("Flights is selected")
    public void flightsIsSelected() {
        flightSearchPage.flightSearchDisplayed();

    }
}
