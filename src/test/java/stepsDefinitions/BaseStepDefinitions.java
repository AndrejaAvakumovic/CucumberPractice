package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.DriverUtils;
import screenshoot.Screenshoots;

import java.sql.Driver;

public class BaseStepDefinitions extends BasePage {


    public BaseStepDefinitions(DriverUtils d) {
        super(d.driver);
    }


    @Given("Launch the browser")
    public void launch_the_browser() {
        System.out.println("Browser is opened");
    }

    @Given("Maximize the window")
    public void maximize_the_window() {
        driver.manage().window().maximize();
    }

    @Given("Open automation practice")
    public void open_automation_practice() {
        driver.get("http://automationpractice.com/index.php");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            Screenshoots screenshoots = new Screenshoots(driver);
            screenshoots.takeScreenShot(scenario);
        }
        driver.quit();
    }
    
}
