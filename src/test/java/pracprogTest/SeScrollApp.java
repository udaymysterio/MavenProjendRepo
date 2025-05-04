package pracprogTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeScrollApp {
	
	private By esignatures = By.xpath("//span[text()='# eSignatures']");
	private By esignscroll = By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[13]");
	private By threedots = By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[11]");
//    private By activereminder = By.xpath("(//mat-icon[@role='img'][normalize-space()='notifications_active'])[5]");
//	private By esignflow = By.xpath("//span[normalize-space()='E-Sign Flow']");
//	private By esignflowclose = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/div/div/lib-esign-select-flow/div/div[1]/button/span[5]");
//	private By securelink = By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Open Secure Link' and starts-with(@class,'mat-icon')][1])[3]");
//	private By opensecurelink = By.xpath("(//p[contains(text(),'open')])[1]");
//	private By downloadesign = By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Download' and starts-with(@class,'mat-icon')][1])[10]");
//    private By viewinvoice = By.xpath("(//div[@mattooltip='View Invoice'])[3]");
//    private By opensettings = By.xpath("//span[@class='mdc-list-item__primary-text']//span[normalize-space()='Settings']");
//    private By cancelsetting = By.xpath("(//span[normalize-space()='Cancel'])[1]");
    private By historyesign = By.xpath("//span[normalize-space()='History']");
    private By closehistory = By.xpath("(//mat-icon[@class='mat-icon notranslate mt-3 fs-6 material-icons mat-ligature-font mat-icon-no-color'])[1]");
//    private By syncesign = By.xpath("//span[@class='mdc-list-item__primary-text']//span[normalize-space()='Sync']");//   private By kbafailed = By.xpath("//mat-icon[normalize-space()='cancel']");
//	private By expired = By.xpath("//div[normalize-space()='Expired']");
//	private By signed = By.xpath("//div[normalize-space()='Signed']");
//	private By done = By.xpath("//div[normalize-space()='Done']");
//	private By archived = By.xpath("//div[normalize-space()='Archived']"); 
	private By userEmail = By.cssSelector("input[placeholder='Username']");
	private By userPwd = By.id("input__password");
	private By loginButton = By.xpath("//button[@type='submit']");
//	private By errorMessage = By.xpath("//div[@class='error mb-20']");
	private By userProfile = By.xpath("(//div[@class='mat-mdc-menu-trigger logout-profile-badge'])[1]");
	private By logout = By.xpath("(//span[contains(text(),'Sign Out')])[1]");
	private By homeButton = By.xpath("(//mat-icon[normalize-space()='home'])[1]");

	@Test
	public void settingspop() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://auth.qount.io/test?rd=https://test.qount.io&org=test");
		Thread.sleep(5000);
		driver.findElement(userEmail).sendKeys("udayandeviant@gmail.com");   				
		driver.findElement(userPwd).sendKeys("Qount-uday18");				
	 	driver.findElement(loginButton).click();
	 	Thread.sleep(13000);
		driver.findElement(esignatures).click();
		Thread.sleep(9000);
		WebElement iscroll = driver.findElement(esignscroll);
		JavascriptExecutor Jscr = (JavascriptExecutor) driver;
		Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
		Thread.sleep(3000);
		driver.findElement(threedots).click();
		Thread.sleep(4000);
		driver.findElement(historyesign).click();
		Thread.sleep(6000);
		driver.findElement(closehistory).click();
		Thread.sleep(5000);
		driver.findElement(homeButton).click();
		Thread.sleep(5000);
		driver.findElement(userProfile).click();
		Thread.sleep(2000);
		driver.findElement(logout).click();
		Thread.sleep(6000);
		driver.close();
	}
	}

