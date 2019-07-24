package co.uk.safebear;

import co.uk.safebear.utils.Drivers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver driver;

    @Before

    public void setUp() {

        //get the driver from the browser (e.g. ChromeDriver)
        driver = Drivers.getDriver();
        //Navigate the URL to our webpage
        driver.get(Drivers.getUrl());

        driver.get("http://toolslist.safebear.co.uk:8080");
        driver.get(Drivers.getUrl());
    }

    @After
    public void tearDown(){

        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep","2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }




    @Given("I am logged out")
public void i_am_logged_out() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Then the user is informed that the login is succesful")
    public void then_the_user_is_informed_that_the_login_is_succesful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }




    @Given("User has typed tool name Zabby")
    public void user_has_typed_tool_name_Zabby() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Zabby tool list is returned")
    public void zabby_tool_list_is_returned() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I search tool name {string} in the search field")
    public void i_search_tool_name_toolname_in_the_search_field(String toolname) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the correct tool will appear in the list")
    public void the_correct_tool_will_appear_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
