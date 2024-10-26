package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.UserLogin;

public class UserLoginSteps {
    @Steps
    UserLogin userLogin;

    @Given("I set API endpoint for login")
    public void setApiEndpoint() {userLogin.setApiEndpoint();
    }

    @When("I send request to login with valid username {string} and valid password {string}")
    public void sendLoginRequest(String username, String password) {userLogin.sendLoginRequest(username, password);
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200(){userLogin.receiveStatusCode200();}

    @And("I receive valid data for login")
    public void receiveValidDataForLogin() {userLogin.receiveValidDataForLogin();
    }
}
