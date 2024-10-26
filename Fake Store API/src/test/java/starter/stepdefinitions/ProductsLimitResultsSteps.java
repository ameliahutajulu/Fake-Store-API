package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import starter.user.ProductsLimitResults;
public class ProductsLimitResultsSteps {
    @Steps
    ProductsLimitResults productsLimitResults;

    @Given("I set API endpoint for get products limit")
    public void setApiEndpoint(){productsLimitResults.setApiEndpoint();}

    @When("I send request to get products limit")
    public void sendGetProductsLimitRequest(){productsLimitResults.sendGetProductsLimitRequest();}

    @And("I receive valid data for products limit")
    public void receiveValidProductsLimitData(){productsLimitResults.receiveValidProductsLimitData();}
}
