package org.booking;

import common.ElementPresenceWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.TravelArticlesPage;

public class TravelArticlesStepDefs {

    TravelArticlesPage travelArticlesPage = new TravelArticlesPage();
    @When("I select Travel Articles from the menu options")
    public void iSelectTravelArticlesFromTheMenuOptions() {
        travelArticlesPage.selectTravelArticles();
    }

    @And("select Explore Nature")
    public void selectExploreNature() {
        travelArticlesPage.selectExploreNature();

    }

    @Then("I am able to read articles on rivers to visit")
    public void iAmAbleToReadArticlesOnRiversToVisit() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//div[text()='Rivers']")));
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//div[text()='Rivers']")).isDisplayed());
    }
}
