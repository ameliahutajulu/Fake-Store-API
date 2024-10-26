package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CartsSortResults {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get carts sort results")
    public String setApiEndpoint() {
        return url + "/carts?sort=desc";
    }

    @Step("I send request to get carts sort results")
    public void sendGetCartsSortRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for carts sort results")
    public void receiveValidCartsSortResultsData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CARTS_SORT_RESULTS_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
