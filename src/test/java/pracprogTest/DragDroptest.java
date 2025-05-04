package pracprogTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDroptest {

	@Test
	public void dragAndDrop() throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.google.com/");
           Thread.sleep(3000);
	}	
}
