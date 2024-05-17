package pages;

import org.booking.Hooks;
import org.openqa.selenium.By;

public class CustomerServicePage {
    public void selectContactCustomerService() {
        Hooks.androidDriver.findElement(By.xpath("//button[@aria-label='Menu']")).click();
        Hooks.androidDriver.findElement(By.xpath("//div[text()='Contact Customer Service']")).click();
    }

    public void selectFreqAskedQuestionsFlights() {
        Hooks.androidDriver.findElement(By.xpath("//span[text()='Flights']")).click();
    }

    public void selectBaggageAndSeats() throws InterruptedException {
        Hooks.androidDriver.findElement(By.xpath("//div[text()='Baggage and seats']")).click();
        Thread.sleep(5000);
    }
}
