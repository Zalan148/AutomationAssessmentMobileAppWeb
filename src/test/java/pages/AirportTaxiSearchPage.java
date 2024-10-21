package pages;

import common.ElementPresenceWait;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.booking.Hooks;
import org.openqa.selenium.By;


public class AirportTaxiSearchPage {
    public void airportTaxisSelected() {
        Hooks.androidDriver.findElement(By.xpath("//span[text()='Airport taxis']")).click();
    }

    public void pickUpLocation() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//input[@id='pickupLocation']")));
        Hooks.androidDriver.findElement(By.xpath("//input[@id='pickupLocation']")).sendKeys("Heathrow Airport" + "");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void destinationEntered() {
        Hooks.androidDriver.findElement(By.xpath("//input[@id='dropoffLocation']")).sendKeys("Edinburgh");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Hooks.androidDriver.hideKeyboard();
    }

    public void dateEntered() {
        Hooks.androidDriver.findElement(By.xpath("//button[@aria-label='pickup date input field']")).click();
        Hooks.androidDriver.findElement(By.xpath("//*[@data-test='rw-calendar__next']")).click();
        Hooks.androidDriver.findElement(By.xpath("//*[@data-test='rw-calendar__next']")).click();
        Hooks.androidDriver.findElement(By.xpath("//a[text()='13']")).click();
    }

    public void numberOfPassengers() {
        Hooks.androidDriver.findElement(By.xpath("//select[@id='passengers']")).click();
        Hooks.androidDriver.findElement(By.xpath("//select[@id='passengers']")).sendKeys("2");
    }

    public void searchAirportTaxi() {
        Hooks.androidDriver.findElement(By.xpath("//div[2]/div/div/button[@type='submit']")).click();
    }
}
