package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.ProductsGetAllCategories;
public class ProductsGetAllCategoriesSteps {
    @Steps
    ProductsGetAllCategories productsGetAllCategories;

    @Given("I set API endpoint for get all products categories")
    public void setApiEndpoint() {
        productsGetAllCategories.setApiEndpoint();
    }

    @When("I send request to get all products categories")
    public void sendGetAllProductsCategoriesRequest() {productsGetAllCategories.sendGetAllProductsCategoriesRequest();
    }

    @And("I receive valid data for all products categories")
    public void receiveValidUsersData() {
        productsGetAllCategories.receiveValidUsersData();
    }
}