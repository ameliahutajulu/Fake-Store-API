package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.AddNewProduct;
public class AddNewProductSteps {
    @Steps
    AddNewProduct addNewProduct;

    @Given("I set API endpoint for add new product")
    public void setApiEndpoint() {
        addNewProduct.setApiEndpoint();
    }

    @When("I send request to add new product with valid inputs")
    public void sendAddnewProductRequest() {
        addNewProduct.sendAddnewProductRequest();
    }

    @And("I receive valid data for add new product")
    public void receiveValidAddnewProduct() {
        addNewProduct.receiveValidAddnewProduct();
    }
}
