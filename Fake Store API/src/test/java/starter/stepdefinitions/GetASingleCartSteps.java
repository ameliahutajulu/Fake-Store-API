package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetASingleCart;
public class GetASingleCartSteps {
    @Steps
    GetASingleCart getASingleCart;

    @Given("I set API endpoint for get cart")
    public void setApiEndpoint() {
        getASingleCart.setApiEndpoint();
    }

    @When("I send request to get cart")
    public void sendGetCartRequest() {
        getASingleCart.sendGetCartRequest();
    }

    @And("I receive valid data for cart")
    public void receiveValidCartData() {
        getASingleCart.receiveValidCartData();
    }

}
