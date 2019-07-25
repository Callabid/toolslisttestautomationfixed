package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class Toolspagelocators {

    private By successfulLoginMessage = By.xpath(".//body/div[@class ='container']/p/b");

    // A locator for the Search field
    private By searchFieldLocator = By.id("toolName");

    // A locator for the Search button
    private By searchButtonLocator = By.xpath(".//button[@type='submit' and @class='btn btn-info']");

    // A locator for the product name that's returned
    private By testCafeToollocator = By.xpath(".='TestCafe'");


}
