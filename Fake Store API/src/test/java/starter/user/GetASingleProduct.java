package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetASingleProduct {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get product")
    public String setApiEndpoint() {
        return url + "/products/1";
    }

    @Step("I send request to get product")
    public void sendGetProductRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for product")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_A_SINGLE_PRODUCT_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
