package co.uk.safebear.utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.Callable;

public class Drivers {
    //here we set our url
    private static final String URL = System.getProperty("url","http://toolslist.safebear.co.uk:8080");
    //here we set our browser
    private static final String Browser= System.getProperty("browser","chrome");

    //a method command for getting url
    public static String getUrl(){
        return URL;
    }
    public static WebDriver getDriver(){

        ChromeOptions chromeOptions;
        switch (Browser.toUpperCase()){
            case "CHROME":
                //tells the user which browser we're running our tests on
                System.out.println("Executing on CHROME");
            //Use webdriver manageer to setup chrome driver
                WebDriverManager.chromedriver().setup();
                //Return our Driver
                return new ChromeDriver();

            case ("CHROME_HEADLESS"):
                System.out.println("excuting on CHROME HEADLESS");
                chromeOptions = new ChromeOptions();
                //Set chrome to run headlessly
                chromeOptions.addArguments("headless");

                //make sure window is large and maximsed
                //so nothing disappears off screen
                // (evan in headless mode!)

            case "FIRFOX":
                //Tell user which Browser we're running our test on
                System.out.println("Excuting on FIREFOX");
                //Use WebDriverManger to setup firefox drever
                WebDriverManager.firefoxdriver().setup();
                //Return our Driver
                return new FirefoxDriver();

            default:
                throw new IllegalArgumentException("The Browser Type is Undefined");
        }
    }


}
