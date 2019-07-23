package co.uk.safebear;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {@Given("I am logged out")
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


    You can implement missing steps with the snippets below:

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

    @When("I search tool name <toolname> in the search field")
    public void i_search_tool_name_toolname_in_the_search_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the correct tool will appear in the list")
    public void the_correct_tool_will_appear_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
