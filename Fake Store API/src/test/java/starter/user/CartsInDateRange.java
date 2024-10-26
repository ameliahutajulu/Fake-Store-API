package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
public class CartsInDateRange {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get carts in date range")
    public String setApiEndpoint() {
        return url + "/carts?startdate=2019-12-10&enddate=2020-10-10";
    }

    @Step("I send request to get carts in date range")
    public void sendGetSpecificDateRangeRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for carts in date range")
    public void receiveSpecificDateRangeData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CARTS_IN_DATE_RANGE);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}