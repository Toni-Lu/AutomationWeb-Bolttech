package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base{
    //Var
    By searchText = By.name("text");
    By buttonSearch = By.name("buscar");
    By Calendar1 = By.cssSelector(".dayContainer:nth-child(1) > .flatpickr-day:nth-child(8)");
    By Calendar2 = By.cssSelector(".dayContainer:nth-child(1) > .flatpickr-day:nth-child(13)");
    By List = By.cssSelector("ul:nth-child(1) > .recommend-result:nth-child(3) .text-small");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void SearchCity() throws InterruptedException {
        write("BARCE",searchText);
        Thread.sleep(6000);
        Click(List);
        Thread.sleep(3000);
        Click(Calendar1);
        Click(Calendar2);
        Thread.sleep(3000);
        Click(buttonSearch);
    }

}
