package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class ProductsLimitResults {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get products limit")
    public String setApiEndpoint() {
        return url + "/products?limit=5";
    }

    @Step("I send request to get products limit")
    public void sendGetProductsLimitRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for products limit")
    public void receiveValidProductsLimitData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.PRODUCTS_LIMIT_RESULTS_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
