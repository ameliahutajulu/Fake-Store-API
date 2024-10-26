package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CartsLimitResults {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get carts limit")
    public String setApiEndpoint() {
        return url + "/carts?limit=5";
    }

    @Step("I send request to get carts limit")
    public void sendGetCartsLimitRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for carts limit")
    public void receiveValidCartsLimitData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CARTS_LIMIT_RESULTS_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
