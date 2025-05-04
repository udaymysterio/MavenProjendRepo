package pracprogTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenPopup {

	@Test
	public void PopHide() throws InterruptedException {
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.flipkart.com/");
           Thread.sleep(5000);
           //previous slide
           driver.findElement(By.xpath("(//button)[2]")).click();
           Thread.sleep(3000);
	}
}