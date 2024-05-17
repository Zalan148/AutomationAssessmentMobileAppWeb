package org.booking;

import common.ElementPresenceWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.AttractionsSearchPage;

public class AttractionsStepDefs {

    AttractionsSearchPage attractionsSearchPage = new AttractionsSearchPage();

    @And("Attractions is selected")
    public void attractionsIsSelected() {
        attractionsSearchPage.attractionsSelected();
    }

    @When("I enter a city")
    public void iEnterACity() throws InterruptedException {
        attractionsSearchPage.attractionsEnterCity();
    }

    @And("sort the search results by lowest price")
    public void sortByLowestPrice() {
        attractionsSearchPage.attractionsSortLowestPrice();
    }

    @Then("the attractions search results are displayed by lowest price")
    public void theAttractionsSearchResultsAreDisplayedByLowestPrice() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//span[text()='Lowest price']")));
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//span[text()='Lowest price']")).isDisplayed());
    }

    @And("I perform a search")
    public void iPerformASearch() throws InterruptedException {
        attractionsSearchPage.performSearch();
        Thread.sleep(5000);
    }
}
