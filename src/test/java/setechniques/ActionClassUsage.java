package setechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;


public class ActionClassUsage {
    WebDriver driver;

    @BeforeTest
    public void launchapp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/");
        Thread.sleep(4000);
    }
    @Test
    public void verifyAction() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        Thread.sleep(3000);
        Actions ac = new Actions(driver);
        WebElement live = driver.findElement(By.xpath("//h4[text()='Live']"));
        ac.moveToElement(live).build().perform();
        Thread.sleep(5000);
        WebElement automate = driver.findElement(By.xpath("//h4[text()='Automate']"));
        automate.click();
        Thread.sleep(3000);
    }
    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}