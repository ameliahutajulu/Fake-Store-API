package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UpdateAProduct;
public class UpdateAProductSteps {
    @Steps
    UpdateAProduct updateAProduct;

    @Given("I set API endpoint for update product")
    public void setApiEndpoint() {
        updateAProduct.setApiEndpoint();
    }

    @When("I send request to update product with valid inputs")
    public void sendUpdateaProductRequest() {
        updateAProduct.sendUpdateaProductRequest();
    }

    @And("I receive valid data for updated product")
    public void receiveValidUpdateaProduct() {
        updateAProduct.receiveValidUpdateaProduct();
    }
}
