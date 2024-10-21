package pages;


import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.booking.Hooks;
import org.openqa.selenium.By;



public class StaysSearchPage {
    public void staysSelected() {
        Hooks.androidDriver.findElement(By.xpath("//span[text()='Stays']")).isDisplayed();
    }

    public void enterDestination() {
        Hooks.androidDriver.findElement(By.xpath("//input[@type='search']")).click();
        Hooks.androidDriver.findElement(By.xpath("//input[@type='search']")).sendKeys("Las Vegas");
        Hooks.androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

}
