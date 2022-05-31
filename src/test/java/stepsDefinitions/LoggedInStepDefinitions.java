package stepsDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.DriverUtils;

public class LoggedInStepDefinitions extends BasePage {
    public LoggedInStepDefinitions(DriverUtils d) {
        super(d.driver);
    }

    @Given("User loges in")
    public void user_loges_in(){
        click(By.className("login"));
        writeText(By.id("email"),"comtradeqa7@example.com");
        writeText(By.id("passwd"),"12345");
        click(By.id("SubmitLogin"));
    }

}
