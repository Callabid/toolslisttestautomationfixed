package co.uk.safebear;

import co.uk.safebear.pages.Loginpage;
import co.uk.safebear.pages.Toolspage;
import co.uk.safebear.utils.Drivers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class Stepdefs {


    WebDriver driver;
    Loginpage loginPage;
    Toolspage toolsPage;


    @Before

    public void setUp() {

        //get the driver from the browser (e.g. ChromeDriver)
        driver = Drivers.getDriver();
        //Navigate the URL to our webpage
        driver.get(Drivers.getUrl());

        loginPage = new Loginpage(driver);
        toolsPage = new Toolspage(driver);


        driver.get("http://toolslist.safebear.co.uk:8080");
        driver.get(Drivers.getUrl());


    }

    @After
    public void tearDown() {

        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }


    @Given("I am logged out")

    public void i_am_logged_out() {

        //Assert that we're on the 'login page'
        assertEquals("we're not on the Login Page", "Login Page", loginPage.getPage());

    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

    }

    @Then("Then the user is informed that the login is succesful")
    public void then_the_user_is_informed_that_the_login_is_succesful() {

        assertThat("Login failed or the Login Successful message didn't apear", toolsPage.checkForLoginSuccessfulMessage(), containsString("Login Successful"));
    }


    @Given
            ("User has typed tool name Zabby")
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
