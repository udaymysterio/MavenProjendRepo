package pracprogTest;

import java.util.List;
//import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UrlSearchPrint {

	@Test
	public void SearchUrl() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
        driver.switchTo().activeElement().sendKeys("WiproJobs" + Keys.ENTER);
        Thread.sleep(4000);
        List<WebElement> alllink = driver.findElements(By.xpath("//a"));
        int count = alllink.size();
        System.out.println(count);
        Thread.sleep(2000);
        for(WebElement text:alllink) {
        	System.out.println(text);
        }
        driver.close();
	}

}
