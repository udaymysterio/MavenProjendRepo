package pracprogTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowTitles {
    
	@Test
	public void TitleWindow() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/");
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String Win:allwh) {
			driver.switchTo().window(Win);
			String Title = driver.getTitle();
			System.out.println(Title);
		}
        driver.quit();
	}

}
