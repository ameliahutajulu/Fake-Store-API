package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
public class GetUserCarts {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get user carts")
    public String setApiEndpoint() {
        return url + "/carts/user/2";
    }

    @Step("I send request to get user carts")
    public void sendGetUserCartsRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for user carts")
    public void receiveValidUserCartsData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_CARTS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
