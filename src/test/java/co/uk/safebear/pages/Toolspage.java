package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.Loginpagelocators;
import co.uk.safebear.pages.locators.Toolspagelocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class Toolspage {

    @NonNull
    WebDriver driver;

    Toolspagelocators locators = new Toolspagelocators();

    public String getPage(){

        return driver.getTitle();
    }
//    public void clickOnsubmitSearchbutton(){
//
//        driver.findElement(locators.getSearchbuttonLocator()).click());
//
//    }
//
//    public void typeInSearchField(String toolName){
//        driver.findElement(locators.getSearchbuttonLocator()).sendKeys(toolName);
//    }

    public String getNameOfTool(){

        return driver.findElement(locators.getTestCafeToollocator()).getText();
    }

    public String checkForLoginSuccessfulMessage(){

        return driver.findElement(locators.getSuccessfulLoginMessage()).getText();
    }
}


