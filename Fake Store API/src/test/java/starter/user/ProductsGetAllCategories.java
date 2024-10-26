package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class ProductsGetAllCategories {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get all products categories")
    public String setApiEndpoint() {
        return url + "/products/categories";
    }

    @Step("I send request to get all products categories")
    public void sendGetAllProductsCategoriesRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for all products categories")
    public void receiveValidUsersData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CATEGORIES_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
