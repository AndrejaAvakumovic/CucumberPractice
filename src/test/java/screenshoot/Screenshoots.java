package screenshoot;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class Screenshoots extends BasePage {

    public Screenshoots (WebDriver driver){
        super(driver);
    }
    public void takeScreenShot (Scenario scenario){
        if (driver != null){
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
            File tempFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File savedFile = new File(("lib/screenshots/")+ scenario.getName()+"_"+formater.format(calendar.getTime())+"-"+ Arrays.toString(scenario.getSourceTagNames().toArray())+ ".jpg");
            try {
                FileUtils.copyFile(tempFile,savedFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else System.out.println("Screenshot failed due to driver lost in parallel execution");
    }
}
