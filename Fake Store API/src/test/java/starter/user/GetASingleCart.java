package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
    public class GetASingleCart {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get cart")
    public String setApiEndpoint() {
        return url + "/carts/5";
    }

    @Step("I send request to get cart")
    public void sendGetCartRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for cart")
    public void receiveValidCartData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_A_SINGLE_CART_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }


}
