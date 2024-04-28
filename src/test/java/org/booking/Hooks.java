package org.booking;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    //this works on my laptop
    public static AndroidDriver androidDriver;
    @Before
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("AnyDeviceName");
        options.noReset().withBrowserName("Chrome");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        androidDriver.get("https://booking.com");
        androidDriver.findElement(By.xpath("//button[text()='Accept']")).click();
    }

    @After
    public void teardown(){
        androidDriver.quit();
    }
}
