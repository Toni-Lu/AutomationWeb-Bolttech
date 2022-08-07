package POM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ReservationHotel {
    private WebDriver driver;
    HomePage homePage;
    SelectHotel selectHotel;
    BookHotel bookHotel;


    @Before
    public void setUp() throws  Exception{
        homePage = new HomePage(driver);
        driver = homePage.ChromeConnection();
        homePage.Visit("https://www.amimir.com/");
    }

    @After
    public void tearDown () throws  Exception{
        //driver.quit();
    }

    @Test
    public void ReservationHotel () throws  InterruptedException{
        selectHotel = new SelectHotel(driver);
        bookHotel = new BookHotel(driver);
        homePage.SearchCity();
        selectHotel.FirstHotel();
        bookHotel.Booking();
    }

}
