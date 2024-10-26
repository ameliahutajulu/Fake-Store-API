package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUserCarts;
public class GetUserCartsSteps {
    @Steps
    GetUserCarts getUserCarts;

    @Given("I set API endpoint for get user carts")
    public void setApiEndpoint() {
        getUserCarts.setApiEndpoint();
    }

    @When("I send request to get user carts")
    public void sendGetUserCartsRequest() {
        getUserCarts.sendGetUserCartsRequest();
    }

    @And("I receive valid data for user carts")
    public void receiveValidUserCartsData() {
        getUserCarts.receiveValidUserCartsData();
    }
}
