package pages;

import common.ElementPresenceWait;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.booking.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AttractionsSearchPage {
    public void attractionsSelected() {
        Hooks.androidDriver.findElement(By.xpath("//span[text()='Attractions']")).click();
    }

    public void attractionsEnterCity() throws InterruptedException {
        Hooks.androidDriver.findElement(By.xpath("//input[@data-testid='search-input-field']")).click();
        Hooks.androidDriver.findElement(By.xpath("//input[@data-testid='search-input-field']")).sendKeys("London");
        Thread.sleep(5000);
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }


    public void attractionsSortLowestPrice() {
        ElementPresenceWait.waitUntilVisible(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//span[text()='Our top picks']")));
        WebElement ourTopPicks = ElementPresenceWait.waitUntilClickable(Hooks.androidDriver, Hooks.androidDriver.findElement(By.xpath("//span[text()='Our top picks']")));
        ourTopPicks.findElement(By.xpath("//span[text()='Our top picks']")).click();
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.TAB));
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.TAB));
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.TAB));
        Hooks.androidDriver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div/div[3]/label/span[2]")).click();
    }

    public void performSearch() {
        Hooks.androidDriver.findElement(By.xpath("//button[@data-testid='search-button']")).click();
    }
}
