package setechniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Objects;

import static org.testng.Assert.*;

public class VerifyPageSource {
    WebDriver driver;
    @Test
    public void launchapp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }
    }

