package omayoweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeLocators {
    WebDriver driver;
    @BeforeMethod
    public void omayoUrl() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(4000);
    }
    @Test(priority = 1)
    public void textAreaOne() throws InterruptedException {

        driver.findElement(By.id("ta1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ta1")).sendKeys("Uday kumar bajji");
        Thread.sleep(3000);
        driver.close();
    }
    @Test(priority = 2)
    public void textAreaTwo() throws InterruptedException {
        driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']")).sendKeys("Bajji Kumar Uday");
        Thread.sleep(3000);
        driver.close();
    }
    @Test(priority = 3)
    public void radioGender() throws InterruptedException {
        driver.findElement(By.id("radio1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("radio2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("radio1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("radio2")).click();
        Thread.sleep(2000);
        driver.close();
    }
    @Test(priority = 4)
    public void windowHome() throws InterruptedException {
        driver.findElement(By.linkText("Open a popup window")).click();
        Thread.sleep(4000);
        String onewindow = driver.getWindowHandle();
        driver.switchTo().window(onewindow);
        Thread.sleep(3000);
        driver.close();
    }
}