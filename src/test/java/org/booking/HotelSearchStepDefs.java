package org.booking;

import common.ElementPresenceWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.StaysSearchPage;

public class HotelSearchStepDefs {

    StaysSearchPage staysSearchPage = new StaysSearchPage();
    @And("Stays is selected")
    public void staysIsSelected() {
        staysSearchPage.staysSelected();
    }

    @When("I enter destination as Las Vegas")
    public void iEnterDestinationAsLasVegas() {
        staysSearchPage.enterDestination();
    }

    @Then("the hotel search results are displayed")
    public void theHotelSearchResultsAreDisplayed() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//span[text()='Sort']")));
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//span[text()='Sort']")).isDisplayed());
    }
}
