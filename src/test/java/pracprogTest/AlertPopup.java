package pracprogTest;

import baseSetPackage.BasePage;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pracprogPage.PracClassPage;

import java.io.IOException;


public class AlertPopup {
	WebDriver driver;
	PracClassPage alertpagekey;

	@BeforeClass
	public void AcceptAlert() throws InterruptedException, IOException {
		alertpagekey = new PracClassPage(driver);
	}
	@Test
	public void alertoption() throws Exception {
		alertpagekey.Alertacpt();
/*		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		Thread.sleep(2000);
		a.accept();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();        */
	}
}