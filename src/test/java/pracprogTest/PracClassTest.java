package pracprogTest;

import baseSetPackage.BasePage;
import mavenProjSet.ListenerPro;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pracprogPage.HerokuAppPage;
import pracprogPage.PracClassPage;

@Listeners(ListenerPro.class)
public class PracClassTest extends BasePage implements ITestListener {

//	WebDriver driver;
//	JavascriptExecutor jsDriver;
	PracClassPage pracclasskey;

	@BeforeClass
	public void pracclassWeb() {
	//	driver = new ChromeDriver();
		pracclasskey = new PracClassPage(driver);
	}
	@Test(priority = 1)
	public void testaio() throws Exception {
		pracclasskey.Alertacpt();
	}
	@AfterClass
	public void tearDowner() {
		if (driver != null) {
			driver.close();
		}
	}
}
