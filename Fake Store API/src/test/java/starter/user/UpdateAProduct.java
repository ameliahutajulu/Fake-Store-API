package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateAProduct {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for update product")
    public String setApiEndpoint() {
        return url + "/products/7";
    }

    @Step("I send request to update product with valid inputs")
    public void sendUpdateaProductRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", 7);
        requestBody.put("title", "test product");
        requestBody.put("price",13.5F);
        requestBody.put("description","lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint());
    }

    @Step("I receive valid data for updated product")
    public void receiveValidUpdateaProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_A_PRODUCT_SCHEMA);

        restAssuredThat(response -> response.body("'id'", equalTo(7)));
        restAssuredThat(response -> response.body("'title'", equalTo("test product")));
        restAssuredThat(response -> response.body("'price'", equalTo(13.5F)));
        restAssuredThat(response -> response.body("'category'", equalTo("electronic")));
        restAssuredThat(response -> response.body("'description'", equalTo("lorem ipsum set")));
        restAssuredThat(response -> response.body("'image'", equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
