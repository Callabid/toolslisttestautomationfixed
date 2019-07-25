package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.Loginpagelocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class Loginpage {

    Loginpagelocators locators = new Loginpagelocators();

    @NonNull
    WebDriver driver;

    public String getPage() {

        return driver.getTitle();
    }


    public void enterUsername(String username) {

        driver.findElement(locators.getUsernamelocator()).sendKeys(username);
    }

    public void enterPassword(String password) {

        driver.findElement(locators.getPasswordlocator()).sendKeys(password);
    }

    public void clickLoginButton() {

        driver.findElement(locators.getSubmitbottonlocator()).click();
    }

    public String checkForFailedLoginWarning() {
        return driver.findElement(locators.getFailedLoginMessage()).getText();
    }


}
