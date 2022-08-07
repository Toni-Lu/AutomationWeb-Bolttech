package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BookHotel extends Base {


    By buttonBook = By.cssSelector(".hotel-room-distribution:nth-child(1) .hotel-meal-plan-distribution:nth-child(1) .hotel-distribution:nth-child(1) .btn");
    //By buttonBook = By.xpath("/*['@id=hotel-distribution-container']/div[1]/div[2]/div[1]/div[2]/a[1]/div[2]/div[2]");

       public BookHotel(WebDriver driver) {
        super(driver);

    }

    public void Booking () throws InterruptedException {
           Thread.sleep(35000);
        if (IsDisplayed(buttonBook)){
            Click(buttonBook);
        }
        else{
        System.out.print("Element not found");
        }
    }



}
