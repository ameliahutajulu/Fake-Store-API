package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UsersSortResults;
public class UsersSortResultsSteps {
    @Steps
    UsersSortResults usersSortResults;

    @Given("I set API endpoint for get users sort results")
    public void setApiEndpoint() {
        usersSortResults.setApiEndpoint();
    }

    @When("I send request to get users sort results")
    public void sendGetUsersSortRequest() {
        usersSortResults.sendGetUsersSortRequest();
    }

    @And("I receive valid data for users sort results")
    public void receiveValidUsersSortResultsData() {
        usersSortResults.receiveValidUsersSortResultsData();
    }

}
