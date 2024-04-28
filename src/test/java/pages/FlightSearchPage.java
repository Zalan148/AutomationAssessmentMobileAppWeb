package pages;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.booking.Hooks;
import org.openqa.selenium.By;

public class FlightSearchPage
{
    public void bookingSiteOpen() {
        Hooks.androidDriver.findElement(By.xpath("//a[@aria-label='Booking.com']  ")).isDisplayed();
    }

    public void flightSearchDisplayed() {
        Hooks.androidDriver.findElement(By.xpath("//span[text()='Flights']")).click();
        Hooks.androidDriver.findElement(By.xpath("//h1[text()='Compare and book flights with ease']")).isDisplayed();
    }

    public void departureLondon() {

        Hooks.androidDriver.findElement((By.xpath("//button[@data-ui-name='input_location_from_segment_0']"))).click();

        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.DEL));
        Hooks.androidDriver.findElement(By.xpath("//*[@aria-controls='flights-searchbox_suggestions']")).sendKeys("London");
        Hooks.androidDriver.pressKey((new KeyEvent(AndroidKey.TAB)));
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void destinationHongKong() {
        Hooks.androidDriver.findElement((By.xpath("//button[@data-ui-name='input_location_to_segment_0']"))).click();
        Hooks.androidDriver.findElement(By.xpath("//*[@aria-controls='flights-searchbox_suggestions']")).sendKeys("Hong Kong");
        Hooks.androidDriver.pressKey((new KeyEvent(AndroidKey.TAB)));
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void selectDates() {
        Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='button_date_segment_0']")).click();
        Hooks.androidDriver.findElement(By.xpath("//span[@data-ui-name='calendar_cell_2024-04-19']")).click();
        Hooks.androidDriver.findElement(By.xpath("//span[@data-ui-name='calendar_cell_2024-04-26']")).click();
        Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='button_calendar_action_bar_done']")).click();
    }

    public void selectTwoAdults() {
        Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='button_occupancy']")).click();
        Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='button_occupancy_adults_plus']")).click();
        Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='button_occupancy_action_bar_done']")).click();
    }

    public void performSearch() {
        Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='button_search_submit']")).click();
    }


}
