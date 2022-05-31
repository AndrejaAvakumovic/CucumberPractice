package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.DriverUtils;

public class VerificationStepDefinitions extends BasePage {
    public VerificationStepDefinitions(DriverUtils d) {
        super(d.driver);
    }


    @Then("Error message is displayed {string}")
    public void error_message_is_displayed(String errorMessage) {
        String error = readText(By.xpath("//*[@id=\"center_column\"]/div[1]"));
        assertStringEquals(error,errorMessage);
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        String signOut = readText(By.className("logout"));
        assertStringEquals(signOut,"Sign out");

    }

    @Then("User is logged out")
    public void userIsLoggedOut() {
        String signIn = readText(By.className("login"));
        assertStringEquals(signIn,"Sign in");
    }

    @Then("Order is completed")
    public void orderIsCompleted() {
        String orderConfirmation = readText(By.cssSelector("#center_column > h1"));
        assertStringEquals(orderConfirmation,"ORDER CONFIRMATION");
    }

    @And("User clicks on pay by bank wire at payment")
    public void userClicksOnPayByBankWireAtPayment() {
        clickUsingJavaScriptExecutor(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a"));
    }
}
