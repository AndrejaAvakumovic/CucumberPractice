package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.DriverUtils;


public class LoginStepDefinitions extends BasePage {

    public LoginStepDefinitions(DriverUtils d) {
        super(d.driver);
    }

    @Given("Navigate to Sign in page")
    public void navigate_to_sign_in_page() {
        click(By.className("login"));

    }
    @When("User enters {string} in email field")
    public void user_enters_in_email_field(String string) {
        writeText(By.id("email"),string);

    }
    @When("User enters {string} in password field")
    public void user_enters_in_password_field(String string) {
        writeText(By.id("passwd"),string);

    }
    @When("User clicks on sing in button")
    public void user_clicks_on_sing_in_button() {
        click(By.id("SubmitLogin"));

    }
}
