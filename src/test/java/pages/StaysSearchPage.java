package pages;

import common.ElementPresenceWait;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.booking.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class StaysSearchPage {
    public void staysSelected() {
        Hooks.androidDriver.findElement(By.xpath("//span[text()='Stays']")).isDisplayed();
    }

    public void enterDestination() {
        Hooks.androidDriver.findElement(By.xpath("//input[@type='search']")).click();
        Hooks.androidDriver.findElement(By.xpath("//input[@type='search']")).sendKeys("Las Vegas");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));

    }

    public void selectCheckInCheckOutDates() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//button[@data-testid='sb-minified']")));
        WebElement checkInOut = ElementPresenceWait.waitUntilClickable(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//button[@data-testid='sb-minified']")));
        checkInOut.findElement(By.xpath("//button[@data-testid='sb-minified']")).click();
        Hooks.androidDriver.findElement(By.xpath("//button[@class='b8118a93a7'][1]")).click();

        int i = 0;
        while (i < 2) {
            Hooks.androidDriver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
            i++;
        }

        Hooks.androidDriver.findElement(By.xpath("//span[text()='6']")).click();
        Hooks.androidDriver.findElement(By.xpath("//button[@class='b8118a93a7'][2]")).click();
        Hooks.androidDriver.findElement(By.xpath("//span[text()='12']")).click();
    }

    public void selectThreeAdultsTwoChildren() {
        Hooks.androidDriver.findElement(By.xpath("//select[@name='group_adults']")).click();
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.TAB));
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.TAB));
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Hooks.androidDriver.findElement(By.xpath("//select[@name='group_children']")).click();
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.TAB));
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.TAB));
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void performHotelSearch() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//button[@type='submit']")));
        WebElement searchHotels = ElementPresenceWait.waitUntilClickable(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//button[@type='submit']")));
        searchHotels.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
