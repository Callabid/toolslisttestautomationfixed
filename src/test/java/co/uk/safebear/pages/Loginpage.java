package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.Loginpagelocators;
import co.uk.safebear.utils.Drivers;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Text;

import java.rmi.activation.ActivationGroup_Stub;

@RequiredArgsConstructor
public class Loginpage {

    Loginpagelocators locators = new Loginpagelocators();

    @NonNull
    WebDriver driver;

    public String getPage(){

        return driver.getTitle();
    }


    public void enterUsername(String username){

        driver.findElement(locators.getUsernamelocator()).sendKeys(username);
    }

    public void enterPassword(String password){

        driver.findElement(locators.getPasswordlocator()).sendKeys(password);
    }

    public void clickLoginButton(){

        driver.findElement(locators.getSubmitbottonlocator()).click();
    }
public void enterToolName(String ToolName){
    driver.findElement (locators.getToolsNameLocator()).sendKeys(ToolName)
}

public void clickSearchButton(){
        driver.findElement(locators.getSearchButtonLocater()).submit();

}
}
