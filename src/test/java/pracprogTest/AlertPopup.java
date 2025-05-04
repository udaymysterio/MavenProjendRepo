package pracprogTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopup {

	@Test
	public void AcceptAlert() throws InterruptedException {
           
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		Thread.sleep(2000);
		a.accept();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
	}
}