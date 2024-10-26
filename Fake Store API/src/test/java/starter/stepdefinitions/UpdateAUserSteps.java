package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UpdateAUser;

public class UpdateAUserSteps {
    @Steps
    UpdateAUser updateAUser;

    @Given("I set API endpoint for update user")
    public void setApiEndpoint() {
        updateAUser.setApiEndpoint();
    }

    @When("I send request to update user with valid inputs")
    public void sendUpdateaUserRequest() {
        updateAUser.sendUpdateaUserRequest();
    }

    @And("I receive valid data for updated user")
    public void receiveValidUpdateaUser() {
        updateAUser.receiveValidUpdateaUser();
    }

}
