package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.ProductsSortResults;
public class ProductsSortResultsSteps {
    @Steps
    ProductsSortResults productsSortResults;

    @Given("I set API endpoint for get products sort results")
    public void setApiEndpoint() {
        productsSortResults.setApiEndpoint();
    }

    @When("I send request to get products sort results")
    public void sendGetProductsSortRequest() {
        productsSortResults.sendGetProductsSortRequest();
    }

    @And("I receive valid data for products sort results")
    public void receiveValidProductsSortResultsData() {
        productsSortResults.receiveValidProductsSortResultsData();
    }
}