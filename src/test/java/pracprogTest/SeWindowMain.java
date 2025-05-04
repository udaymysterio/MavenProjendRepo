package pracprogTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeWindowMain {

	private By esignatures = By.xpath("//span[text()='# eSignatures']");
	private By securelink = By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Open Secure Link' and starts-with(@class,'mat-icon')][1])[3]");
	private By opensecurelink = By.xpath("(//p[contains(text(),'open')])[1]");
	private By userEmail = By.cssSelector("input[placeholder='Username']");
	private By userPwd = By.id("input__password");
	private By loginButton = By.xpath("//button[@type='submit']");
	private By userProfile = By.xpath("(//div[@class='mat-mdc-menu-trigger logout-profile-badge'])[1]");
	private By logout = By.xpath("(//span[contains(text(),'Sign Out')])[1]");
	private By homeButton = By.xpath("(//mat-icon[normalize-space()='home'])[1]");
    private By cancelsetting = By.xpath("(//span[normalize-space()='Cancel'])[1]");
	
	    @Test 
		public void securelinkpopup() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
			driver.get("https://auth.qount.io/test?rd=https://test.qount.io&org=test");
			Thread.sleep(5000);
			driver.findElement(userEmail).sendKeys("udayandeviant@gmail.com");   				
			driver.findElement(userPwd).sendKeys("Qount-uday18");				
		 	driver.findElement(loginButton).click();
		 	Thread.sleep(12000);
			driver.findElement(esignatures).click();
			Thread.sleep(9000);
			driver.findElement(securelink).click();
			Thread.sleep(5000);
			driver.findElement(opensecurelink).click();
			Thread.sleep(7000);
			String realwindow = driver.getWindowHandle();
			driver.switchTo().window(realwindow);
            Thread.sleep(5000);
            driver.findElement(cancelsetting).click();
    		Thread.sleep(5000);
    		driver.findElement(homeButton).click();
    		Thread.sleep(5000);
    		driver.findElement(userProfile).click();
    		Thread.sleep(2000);
    		driver.findElement(logout).click();
    		Thread.sleep(6000);
    		driver.close();
	    }}
