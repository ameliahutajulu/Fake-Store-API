package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import org.json.JSONArray;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class AddNewCart {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for add new cart")
    public String setApiEndpoint() {
        return url + "/carts";
    }

    @Step("I send request to add new cart with valid inputs")
    public void sendAddnewCartRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", 11);
        requestBody.put("userId", 5);
        requestBody.put("date", "2020-02-03");

        JSONArray productsArray = new JSONArray();

        JSONObject product1 = new JSONObject();
        product1.put("productId", 5);
        product1.put("quantity", 1);

         JSONObject product2 = new JSONObject();
        product2.put("productId", 1);
        product2.put("quantity", 5);

        productsArray.put(product1);
        productsArray.put(product2);

        requestBody.put("products", productsArray);


        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiEndpoint());
    }

    @Step("I receive valid data for add new cart")
    public void receiveValidAddnewCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_NEW_CART_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
