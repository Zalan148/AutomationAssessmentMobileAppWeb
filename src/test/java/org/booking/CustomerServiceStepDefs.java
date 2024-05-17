package org.booking;

import common.ElementPresenceWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.CustomerServicePage;

public class CustomerServiceStepDefs {

    CustomerServicePage customerServicePage = new CustomerServicePage();
    @When("I select Contact Customer Service from the menu options")
    public void iSelectContactCustomerServiceFromTheMenuOptions() {
        customerServicePage.selectContactCustomerService();
    }

    @And("select Frequently Asked Questions for flights")
    public void selectFrequentlyAskedQuestionsForFlights() {
        customerServicePage.selectFreqAskedQuestionsFlights();
    }

    @And("select Baggage and seats")
    public void selectBaggageAndSeats() throws InterruptedException {
        customerServicePage.selectBaggageAndSeats();

    }

    @Then("FAQs for Baggage and seats is displayed")
    public void faqsForBaggageAndSeatsIsDisplayed() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//div[text()='Frequently asked questions']")));
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//div[text()='How much baggage can I bring?']")));
        Assert.assertTrue(Hooks.androidDriver.findElement(By.xpath("//div[text()='How much baggage can I bring?']")).isDisplayed());
    }
}
