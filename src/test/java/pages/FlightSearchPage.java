package pages;

import common.ElementPresenceWait;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.booking.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightSearchPage
{
    public void bookingSiteOpen() {
        Hooks.androidDriver.findElement(By.xpath("//a[@aria-label='Booking.com']  ")).isDisplayed();
    }

    public void flightSearchDisplayed() throws InterruptedException {
        Hooks.androidDriver.findElement(By.xpath("//span[text()='Flights']")).click();
        Thread.sleep(10000);
    }

    public void departureLondon() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='input_location_from_segment_0']")));
        WebElement location = ElementPresenceWait.waitUntilClickable(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='input_location_from_segment_0']")));
        location.findElement(By.xpath("//button[@data-ui-name='input_location_from_segment_0']")).click();
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//*[@aria-controls='flights-searchbox_suggestions']")));
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

    public void selectDates() throws InterruptedException {
        Hooks.androidDriver.findElement(By.xpath("//button[@data-ui-name='button_date_segment_0']")).click();
        Thread.sleep(5000);
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.TAB));
        Thread.sleep(5000);

        int i = 0;
        while (i < 2) {
            Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
            Thread.sleep(5000);
            i++;
        }
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(5000);
        int y = 0;
        while (y < 2) {
            Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
            Thread.sleep(5000);
            y++;
        }
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(5000);
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
