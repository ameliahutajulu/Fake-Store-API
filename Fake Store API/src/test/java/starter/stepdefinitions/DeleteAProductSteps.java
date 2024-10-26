package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteAProduct;
public class DeleteAProductSteps {
    @Steps
    DeleteAProduct deleteAProduct;

    @Given("I set API endpoint for delete product")
    public void setApiEndpoint() {
        deleteAProduct.setApiEndpoint();
    }

    @When("I send request to delete product with valid ID")
    public void sendDeleteProductRequest() {
        deleteAProduct.sendDeleteProductRequest();
    }

    @And("I receive deleted product data")
    public void receiveValidDeleteProduct() {
        deleteAProduct.receiveValidDeleteProduct();
    }
}
