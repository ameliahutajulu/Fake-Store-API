package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import starter.user.UsersLimitResults;

public class UsersLimitResultsSteps {
    @Steps
    UsersLimitResults usersLimitResults;

    @Given("I set API endpoint for get users limit")
    public void setApiEndpoint(){usersLimitResults.setApiEndpoint();}

    @When("I send request to get users limit")
    public void sendGetUsersLimitRequest(){usersLimitResults.sendGetUsersLimitRequest();}

    @And("I receive valid data for users limit")
    public void receiveValidUsersLimitData(){usersLimitResults.receiveValidUsersLimitData();}
}
