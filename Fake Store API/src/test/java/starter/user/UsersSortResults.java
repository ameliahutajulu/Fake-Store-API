package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
public class UsersSortResults {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for get users sort results")
    public String setApiEndpoint() {
        return url + "/users?sort=desc";
    }

    @Step("I send request to get users sort results")
    public void sendGetUsersSortRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for users sort results")
    public void receiveValidUsersSortResultsData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.USERS_SORT_RESULTS_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
