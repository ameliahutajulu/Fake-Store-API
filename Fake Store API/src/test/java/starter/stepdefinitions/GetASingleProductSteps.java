package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetASingleProduct;

public class GetASingleProductSteps {
    @Steps
    GetASingleProduct getASingleProduct;
    @Given("I set API endpoint for get product")
    public void setApiEndpoint() {
        getASingleProduct.setApiEndpoint();
    }

    @When("I send request to get product")
    public void sendGetProductRequest() {
        getASingleProduct.sendGetProductRequest();
    }

    @And("I receive valid data for product")
    public void receiveValidProductData() {
        getASingleProduct.receiveValidProductData();
    }

}
