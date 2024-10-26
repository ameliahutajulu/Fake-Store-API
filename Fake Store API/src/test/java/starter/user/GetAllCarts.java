package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllCarts {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get all carts")
    public String setApiEndpoint() {
        return url + "/carts";
    }

    @Step("I send request to get all carts")
    public void sendGetAllCartsRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for all carts")
    public void receiveValidCartsData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CARTS_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
