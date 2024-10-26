package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class AddNewUser {
    private static String url = "https://fakestoreapi.com";

    @Step("I set API endpoint for add new user")
    public String setApiEndpoint() {
        return url + "/users";
    }

    @Step("I send request to add new user with valid inputs")
    public void sendAddnewUserRequest() {
        JSONObject requestBody = new JSONObject();

        JSONObject nameObject = new JSONObject();
        nameObject.put("firstname", "John");
        nameObject.put("lastname", "Doe");

        JSONObject geolocationObject = new JSONObject();
        geolocationObject.put("lat", "-37.3159");
        geolocationObject.put("long", "81.1496");

        JSONObject addressObject = new JSONObject();
        addressObject.put("geolocation", geolocationObject);
        addressObject.put("city", "kilcoole");
        addressObject.put("street", "7835 new road");
        addressObject.put("number", 3);
        addressObject.put("zipcode", "12926-3874");

        requestBody.put("email","John@gmail.com");
        requestBody.put("username","johnd");
        requestBody.put("password","m38rmF$");
        requestBody.put("name", nameObject);
        requestBody.put("address",addressObject);
        requestBody.put("phone", "1-570-236-7033");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiEndpoint());
    }

    @Step("I receive valid data for add new user")
    public void receiveValidAddnewUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_NEW_USER_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
