package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class UpdateACart {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for update cart")
    public String setApiEndpoint() {
        return url + "/carts/7";
    }

    @Step("I send request to update cart with valid inputs")
    public void sendUpdateaCartRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("id",7);
        requestBody.put("userId",3);
        requestBody.put("date", "2019-12-10");

        JSONArray productsArray = new JSONArray();

        JSONObject product1 = new JSONObject();
        product1.put("productId", 1);
        product1.put("quantity", 3);

        productsArray.put(product1);

        requestBody.put("products", productsArray);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint());
    }

    @Step("I receive valid data for updated cart")
    public void receiveValidUpdateaCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_A_CART_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
