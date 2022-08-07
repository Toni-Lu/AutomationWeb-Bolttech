package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    private WebDriver driver;

    public Base (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver ChromeConnection(){
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
           return driver.findElement(locator);
    }



    public boolean IsDisplayed (By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }   catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void write(String inputText,By locator){
       driver.findElement(locator).sendKeys(inputText);
    }

    public void Click (By locator){
        driver.findElement(locator).click();
    }

    public void Visit(String url){
        driver.get(url);
    }
}
