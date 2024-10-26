package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class DeleteAUser {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for delete user")
    public String setApiEndpoint() {
        return url + "/users/6";
    }

    @Step("I send request to delete user with valid ID")
    public void sendDeleteUserRequest() {
        SerenityRest.given().delete(setApiEndpoint());
    }

    @Step("I receive deleted user data")
    public void receiveValidDeleteUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_A_USER_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
