package org.booking;

import common.ElementPresenceWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.AirportTaxiSearchPage;

public class AirportTaxiStepDefs {

    AirportTaxiSearchPage airportTaxiSearchPage = new AirportTaxiSearchPage();
    @And("airport taxis is selected")
    public void airportTaxisIsSelected() {
        airportTaxiSearchPage.airportTaxisSelected();
    }

    @When("pick up location is entered")
    public void pickUpLocationIsEntered() throws InterruptedException {
        airportTaxiSearchPage.pickUpLocation();
    }

    @And("destination is entered")
    public void destinationIsEntered() throws InterruptedException {
        airportTaxiSearchPage.destinationEntered();
    }

    @And("date is entered")
    public void dateIsEntered() {
        airportTaxiSearchPage.dateEntered();
    }

    @And("two passengers is selected")
    public void twoPassengersIsSelected() {
        airportTaxiSearchPage.numberOfPassengers();
    }

    @And("an airport taxi search is performed")
    public void anAirportTaxiSearchIsPerformed() {
        airportTaxiSearchPage.searchAirportTaxi();
    }

    @Then("the airport taxi search results are displayed")
    public void theAirportTaxiSearchResultsAreDisplayed() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//div[text()='The latest prices from our trusted partners']")));
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//div[text()='The latest prices from our trusted partners']")).isDisplayed());
    }
}
