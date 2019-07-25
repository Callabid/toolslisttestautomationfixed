package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class Toolspagelocators {

    private By successfulLoginMessage = By.xpath(".//body/div[@class ='container']/p/b");

    // A locator for the Search field

    // A locator for the Search button

    // A locator for the product name that's returned

    private By ToolNameLocater = By.id("Toolname");

    private By NewToollocator = By.id("NewTool");

    private By Submitbottonlocator = By.id("submit");

}
