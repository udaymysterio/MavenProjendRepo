package pracprogTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingListbox {

	@Test
	public void ListBox() throws InterruptedException {
           
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement Day = driver.findElement(By.id("day"));
		Select d = new Select(Day);
		d.selectByValue("20");
		Thread.sleep(2000);
		WebElement MonthList = driver.findElement(By.id("month"));
		Select slct = new Select(MonthList);
		slct.selectByVisibleText("Dec");
		Thread.sleep(2000);
		WebElement Year = driver.findElement(By.id("year"));
		Select y = new Select(Year);
		y.selectByValue("1990");
		Thread.sleep(3000);
		driver.quit();
	}
}
