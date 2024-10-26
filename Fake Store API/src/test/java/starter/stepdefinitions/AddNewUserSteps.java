package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.AddNewUser;
public class AddNewUserSteps {
    @Steps
    AddNewUser addNewUser;

    @Given("I set API endpoint for add new user")
    public void setApiEndpoint() {
        addNewUser.setApiEndpoint();
    }

    @When("I send request to add new user with valid inputs")
    public void sendAddnewUserRequest() {
        addNewUser.sendAddnewUserRequest();
    }

    @And("I receive valid data for add new user")
    public void receiveValidAddnewUser() {
        addNewUser.receiveValidAddnewUser();
    }
}
