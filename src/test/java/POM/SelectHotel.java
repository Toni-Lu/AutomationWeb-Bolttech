package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SelectHotel extends Base{

    By hotel= By.cssSelector(".hotel-card:nth-child(1) .hotel-name");

    public SelectHotel(WebDriver driver) {
        super(driver);
    }

    public void FirstHotel() throws InterruptedException {
        Thread.sleep(5000);
        if (IsDisplayed(hotel)){
            Click(hotel);
        }
        else{
            System.out.print("Element not found");
        }
    }
}
