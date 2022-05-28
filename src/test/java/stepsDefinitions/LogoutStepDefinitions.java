package stepsDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.DriverUtils;

public class LogoutStepDefinitions extends BasePage {

    public LogoutStepDefinitions(DriverUtils d) {
        super(d.driver);
    }
    @Given("User clicks on sign out button")
    public void user_clicks_on_sign_out_button(){
        click(By.className("logout"));
    }

}
