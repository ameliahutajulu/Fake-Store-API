package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
public class ProductsSpecificCategory {

    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get products with specific category")
    public String setApiEndpoint() {
        return url + "/products/category/jewelery";
    }

    @Step("I send request to get products with specific category")
    public void sendGetSpecificCategoryRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for products with specific category")
    public void receiveSpecificCategoryProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.PRODUCTS_SPECIFIC_CATEGORY_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
