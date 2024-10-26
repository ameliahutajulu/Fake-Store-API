package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetAllProducts;

public class GetAllProductsSteps {

    @Steps
    GetAllProducts getAllProducts;

    @Given("I set API endpoint for get all products")
    public void setApiEndpoint() {
        getAllProducts.setApiEndpoint();
    }

    @When("I send request to get all products")
    public void sendGetAllProductsRequest() {
        getAllProducts.sendGetAllProductsRequest();
    }

    @And("I receive valid data for all products")
    public void receiveValidProductsData() {
        getAllProducts.receiveValidProductsData();
    }
}
