package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.AddNewCart;

public class AddNewCartSteps {
    @Steps
    AddNewCart addNewCart;

    @Given("I set API endpoint for add new cart")
    public void setApiEndpoint() {
        addNewCart.setApiEndpoint();
    }

    @When("I send request to add new cart with valid inputs")
    public void sendAddnewCartRequest() {
        addNewCart.sendAddnewCartRequest();
    }

    @And("I receive valid data for add new cart")
    public void receiveValidAddnewCart() {
        addNewCart.receiveValidAddnewCart();
    }

}
