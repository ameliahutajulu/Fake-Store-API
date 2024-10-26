package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CartsSortResults;
public class CartsSortResultsSteps {
    @Steps
    CartsSortResults cartsSortResults;

    @Given("I set API endpoint for get carts sort results")
    public void setApiEndpoint() {
        cartsSortResults.setApiEndpoint();
    }

    @When("I send request to get carts sort results")
    public void sendGetCartsSortRequest() {
        cartsSortResults.sendGetCartsSortRequest();
    }

    @And("I receive valid data for carts sort results")
    public void receiveValidCartsSortResultsData() {
        cartsSortResults.receiveValidCartsSortResultsData();
    }

}
