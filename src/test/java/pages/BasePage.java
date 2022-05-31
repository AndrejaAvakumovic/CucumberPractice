package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver d){
        driver = d;
    }



    public void waitVisibility(By elementBy){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    public void waitClickability(By elementBy){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }
    public void click(By elementBy){
        waitVisibility(elementBy);
        waitClickability(elementBy);
        driver.findElement(elementBy).click();
    }
    public void writeText(By elementBy, String text){
        waitVisibility(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);

    }
    public String readText(By elementBy){
        waitVisibility(elementBy);
         return driver.findElement(elementBy).getText();
    }
    public void assertStringEquals (String expectedText, String actualText){
        Assert.assertEquals(expectedText,actualText);
    }
    public void clickUsingJavaScriptExecutor(By elementBy){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", driver.findElement(elementBy));
    }
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void hover(By elementBy,WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(elementBy)).build().perform();

    }


}
