package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteACart {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for delete cart")
    public String setApiEndpoint() {
        return url + "/carts/6";
    }

    @Step("I send request to delete cart with valid ID")
    public void sendDeleteCartRequest() {
        SerenityRest.given().delete(setApiEndpoint());
    }

    @Step("I receive deleted cart data")
    public void receiveValidDeleteCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_A_CART_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
