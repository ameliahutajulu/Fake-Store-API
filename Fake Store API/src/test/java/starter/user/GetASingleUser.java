package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetASingleUser {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get user")
    public String setApiEndpoint() {
        return url + "/users/1";
    }

    @Step("I send request to get user")
    public void sendGetUserRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for user")
    public void receiveValidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_A_SINGLE_USER_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
