package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.ProductsSpecificCategory;
public class ProductsSpecificCategorySteps {
    @Steps
    ProductsSpecificCategory productsSpecificCategory;

    @Given("I set API endpoint for get products with specific category")
    public void setApiEndpoint() {
        productsSpecificCategory.setApiEndpoint();
    }

    @When("I send request to get products with specific category")
    public void sendGetSpecificCategoryRequest() {
        productsSpecificCategory.sendGetSpecificCategoryRequest();
    }

    @And("I receive valid data for products with specific category")
    public void receiveSpecificCategoryProductData() {
        productsSpecificCategory.receiveSpecificCategoryProductData();
    }
}