package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import starter.user.CartsLimitResults;
public class CartsLimitResultsSteps {
    @Steps
    CartsLimitResults cartsLimitResults;


    @Given("I set API endpoint for get carts limit")
    public void setApiEndpoint(){cartsLimitResults.setApiEndpoint();}

    @When("I send request to get carts limit")
    public void sendGetCartsLimitRequest(){cartsLimitResults.sendGetCartsLimitRequest();}

    @And("I receive valid data for carts limit")
    public void receiveValidCartsLimitData(){cartsLimitResults.receiveValidCartsLimitData();}


}
