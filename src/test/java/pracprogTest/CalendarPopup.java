package pracprogTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalendarPopup {
	@SuppressWarnings("deprecation")
	@Test
	public void Calendar() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("policynumber")).sendKeys("12345");
		driver.findElement(By.id("dob")).click();
		WebElement yr = driver.findElement(By.className("ui-datepicker-year"));
		Select s = new Select(yr);
		s.selectByVisibleText("2022");
		Thread.sleep(2000);
		WebElement mnt = driver.findElement(By.className("ui-datepicker-month"));
		Select m = new Select(mnt);
		m.selectByVisibleText("Feb");
		Thread.sleep(2000);
		driver.findElement(By.linkText("12")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8551101121");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
