package pages;


import org.booking.Hooks;
import org.openqa.selenium.By;


public class TravelArticlesPage {
    public void selectTravelArticles() {
        Hooks.androidDriver.findElement(By.xpath("//button[@aria-label='Menu']")).click();
        Hooks.androidDriver.findElement(By.xpath("//div[@class='dc5041d860 c72df67c95 fb60b9836d'][text()='Travel articles']")).click();
    }

    public void selectExploreNature() {

        Hooks.androidDriver.findElement(By.xpath("//*[@id='main_content']//button[@type='button']")).click();
        Hooks.androidDriver.findElement(By.xpath("//div[@class='bcdcb105b3'][text()='Explore nature']")).click();
    }
}
