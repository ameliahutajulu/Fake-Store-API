package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CartsInDateRange;

public class CartsDateRangeSteps {
    @Steps
    CartsInDateRange cartsInDateRange;

    @Given("I set API endpoint for get carts in date range")
    public void setApiEndpoint() {
        cartsInDateRange.setApiEndpoint();
    }

    @When("I send request to get carts in date range")
    public void sendGetSpecificDateRangeRequest() {
        cartsInDateRange.sendGetSpecificDateRangeRequest();
    }

    @And("I receive valid data for carts in date range")
    public void receiveSpecificDateRangeData() {
        cartsInDateRange.receiveSpecificDateRangeData();
    }
}
