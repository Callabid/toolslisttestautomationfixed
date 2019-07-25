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

    // Method to enter text into the Search field

    // Method for clicking on the Search button

    // Method to return the text from a title of the tool

    private By ToolNameLocater = By.id("Toolname");

    private By NewToollocator = By.id("NewTool");

    private By Submitbottonlocator = By.id("submit");


}
