package mavenProjSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.FileHandler;

public class ListenerPro implements ITestListener {

    public void onTestStart(ITestResult result) {
    System.out.println("Test started: " +result.getName());
    System.out.println(result.getTestClass());
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " +result.getName());
        System.out.println(result.getTestClass());
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " +result.getName());
        System.out.println(result.getTestClass());
    }
}


/*    @Override
    public void onTestSuccess(ITestResult result) {
        ListenerPro myListener = new ListenerPro();
        myListener.onTestSuccess(result);
    //    ITestListener.onTestSuccess(result);
        Reporter.log("TestCase is Passed ");
        TakesScreenshot tst = (TakesScreenshot)driver;
        File source = tst.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+"/src/main/java/pracprogPage/");
        //   new File("C:\\Users\\uday1\\IJScreenshot\\Pass\\TestPass" + Math.random() + ".png");
        try {
            Files.copy(source.toPath(), destination.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onTestFailure(ITestResult result) {
        ListenerPro myListener = new ListenerPro();
        myListener.onTestFailure(result);
     //   ITestListener.onTestFailure(result);
        Reporter.log("TestCase is failed ");
        TakesScreenshot tst = (TakesScreenshot)driver;
        File source = tst.getScreenshotAs(OutputType.FILE);
 //       File destination = new File("C:\\Users\\uday1\\IJScreenshot\\Fail\\TestFail" + Math.random() + ".png");
        File destination = new File(System.getProperty("user.dir")+"/src/main/java/pracprogPage/");
        try {
            Files.copy(source.toPath(), destination.toPath());
 //       } catch (WebDriverException e) {
        }        catch (IOException e) {
            e.printStackTrace();
        }
    }
}           */