package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetAllCarts;
public class GetAllCartSteps {
    @Steps
    GetAllCarts getAllCarts;

    @Given("I set API endpoint for get all carts")
    public void setApiEndpoint() {
        getAllCarts.setApiEndpoint();
    }

    @When("I send request to get all carts")
    public void sendGetAllCartsRequest() {
        getAllCarts.sendGetAllCartsRequest();
    }

    @And("I receive valid data for all carts")
    public void receiveValidCartsData() {
        getAllCarts.receiveValidCartsData();
    }


}
