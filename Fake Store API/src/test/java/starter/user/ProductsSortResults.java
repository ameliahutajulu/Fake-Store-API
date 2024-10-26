package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
public class ProductsSortResults {

    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get products sort results")
    public String setApiEndpoint() {
        return url + "/products?sort=desc";
    }

    @Step("I send request to get products sort results")
    public void sendGetProductsSortRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for products sort results")
    public void receiveValidProductsSortResultsData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.PRODUCTS_SORT_RESULTS_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
