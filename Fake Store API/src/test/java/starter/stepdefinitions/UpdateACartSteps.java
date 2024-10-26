package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UpdateACart;

public class UpdateACartSteps {
    @Steps
    UpdateACart updateACart;

    @Given("I set API endpoint for update cart")
    public void setApiEndpoint() {
        updateACart.setApiEndpoint();
    }

    @When("I send request to update cart with valid inputs")
    public void sendUpdateaCartRequest() {
        updateACart.sendUpdateaCartRequest();
    }

    @And("I receive valid data for updated cart")
    public void receiveValidUpdateaCart() {
        updateACart.receiveValidUpdateaCart();
    }

}
