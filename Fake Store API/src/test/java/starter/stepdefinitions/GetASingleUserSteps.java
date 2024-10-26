package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetASingleUser;

public class GetASingleUserSteps {
    @Steps
    GetASingleUser getASingleUser;
    @Given("I set API endpoint for get user")
    public void setApiEndpoint() {
        getASingleUser.setApiEndpoint();
    }

    @When("I send request to get user")
    public void sendGetUserRequest() {
        getASingleUser.sendGetUserRequest();
    }

    @And("I receive valid data for user")
    public void receiveValidUserData() {
        getASingleUser.receiveValidUserData();
    }

}

