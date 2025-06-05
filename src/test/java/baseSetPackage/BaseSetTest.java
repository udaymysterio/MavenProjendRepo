package baseSetPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BaseSetTest implements ITestListener {
    protected WebDriver driver;
 //   protected NgWebDriver ngWebDriver;
    protected JavascriptExecutor jsDriver;

    public static String url = "https://omayo.blogspot.com/";

//    @BeforeTest
    private WebDriver returnDriver() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        jsDriver = (JavascriptExecutor) driver;
//        ngWebDriver = new NgWebDriver(jsDriver);
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
    @BeforeClass
    public void initBaseTest(ITestContext context) throws IOException, InterruptedException {
        driver = returnDriver();
        context.setAttribute("webdriver", driver);
    }

    @AfterTest
    public void terminateflow() {
        if (driver != null) {
            driver.quit();
        }
    }
}
