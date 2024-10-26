package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteAProduct {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for delete product")
    public String setApiEndpoint() {
        return url + "/products/6";
    }

    @Step("I send request to delete product with valid ID")
    public void sendDeleteProductRequest() {
        SerenityRest.given().delete(setApiEndpoint());
    }

    @Step("I receive deleted product data")
    public void receiveValidDeleteProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_A_PRODUCT_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
