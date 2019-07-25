package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class Loginpagelocators {

    private By usernamelocator = By.id("username");
    private By passwordlocator = By.id("password");

    private By Submitbottonlocator = By.id("enter");

    private By failedLoginMessage = By.xpath(".//p[@id='rejectLogin']/b");

    private By toolsnamelocater = By,id("toolname");





}
