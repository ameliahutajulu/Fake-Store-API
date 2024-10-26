package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteAUser;
public class DeleteAUserSteps {
    @Steps
    DeleteAUser deleteAUser;

    @Given("I set API endpoint for delete user")
    public void setApiEndpoint() {
        deleteAUser.setApiEndpoint();
    }

    @When("I send request to delete user with valid ID")
    public void sendDeleteUserRequest() {
        deleteAUser.sendDeleteUserRequest();
    }

    @And("I receive deleted user data")
    public void receiveValidDeleteUser() {
        deleteAUser.receiveValidDeleteUser();
    }

}
