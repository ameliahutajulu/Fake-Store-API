package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteACart;
public class DeleteACartSteps {
    @Steps
    DeleteACart deleteACart;

    @Given("I set API endpoint for delete cart")
    public void setApiEndpoint() {
        deleteACart.setApiEndpoint();
    }

    @When("I send request to delete cart with valid ID")
    public void sendDeleteCartRequest() {
        deleteACart.sendDeleteCartRequest();
    }

    @And("I receive deleted cart data")
    public void receiveValidDeleteCart() {
        deleteACart.receiveValidDeleteCart();
    }
}
