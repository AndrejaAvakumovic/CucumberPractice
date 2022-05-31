package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DriverUtils;


public class ByeItemStepDefinitions extends BasePage {
    public ByeItemStepDefinitions(DriverUtils d) {
        super(d.driver);
    }

    @Given("Navigate to Home page")
    public void navigateToHomePage() {
        click(By.xpath("//img[@alt='My Store']"));
    }
    @When("User clicks on item picture")
    public void userClicksOnItemPicture() {
        hover(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img"),driver);

    }

    @And("User clicks on Add to cart button")
    public void userClicksOnAddToCartButton() {
        click(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]"));
    }

    @And("User clicks on proceed to checkout  button at pop-up")
    public void userClicksOnProceedToCheckoutButtonAtPopUp() {
        clickUsingJavaScriptExecutor(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a"));
    }
    @And("User clicks on proceed to checkout button at summary")
    public void userClicksOnProceedToCheckoutButtonAtSummary() {
        clickUsingJavaScriptExecutor(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium"));
    }

    @And("User clicks on proceed to checkout button at address")
    public void userClicksOnProceedToCheckoutButtonAtAddress() {
        clickUsingJavaScriptExecutor(By.cssSelector("#center_column > form > p > button"));
    }

    @And("User clicks on checkButton at shipping")
    public void userClicksOnCheckButtonAtShipping() {
        hover(By.cssSelector("#uniform-cgv"),driver);
        click(By.cssSelector("#uniform-cgv"));
//        clickUsingJavaScriptExecutor(By.cssSelector("#uniform-cgv"));
    }

    @And("User clicks on proceed to checkout button at shipping")
    public void userClicksOnProceedToCheckoutButtonAtShipping() {
        clickUsingJavaScriptExecutor(By.cssSelector("#form > p > button"));
    }

    @And("User clicks on confirm button")
    public void userClicksOnConfirmButton() {
        clickUsingJavaScriptExecutor(By.cssSelector("#cart_navigation > button"));
    }
}







