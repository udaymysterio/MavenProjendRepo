package pracprogTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTimeLogin {
    
	@Test
	public void loginActiTime() throws InterruptedException {

           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://demo.actitime.com/");
           driver.findElement(By.id("username")).sendKeys("admin");
           Thread.sleep(3000);
           driver.findElement(By.name("pwd")).sendKeys("manager");
           Thread.sleep(3000);
           driver.findElement(By.xpath("//div[text()='Login']")).click();
           Thread.sleep(10000);
           driver.close();
	}
}