package pracprogTest;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeTryElseCatch {
	private By esignatures = By.xpath("//span[text()='# eSignatures']");
//	private By securelink = By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Open Secure Link' and starts-with(@class,'mat-icon')][1])[3]");
//	private By opensecurelink = By.xpath("(//p[contains(text(),'open')])[1]");
	private By userEmail = By.cssSelector("input[placeholder='Username']");
	private By userPwd = By.id("input__password");
	private By loginButton = By.xpath("//button[@type='submit']");
//	private By userProfile = By.xpath("(//div[@class='mat-mdc-menu-trigger logout-profile-badge'])[1]");
//	private By logout = By.xpath("(//span[contains(text(),'Sign Out')])[1]");
//	private By homeButton = By.xpath("(//mat-icon[normalize-space()='home'])[1]");
//    private By cancelsetting = By.xpath("(//span[normalize-space()='Cancel'])[1]");
	private By esignscroll = By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[13]");

    @Test
	public void esignSetReminder() throws Exception {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://auth.qount.io/test?rd=https://test.qount.io&org=test");
		Thread.sleep(5000);
		driver.findElement(userEmail).sendKeys("udayandeviant@gmail.com");   				
		driver.findElement(userPwd).sendKeys("Qount-uday18");				
	 	driver.findElement(loginButton).click();
	 	Thread.sleep(11000);
		driver.findElement(esignatures).click();
		Thread.sleep(9000);
		WebElement iscroll = driver.findElement(esignscroll);
		JavascriptExecutor Jscr = (JavascriptExecutor) driver;
		Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
		Thread.sleep(5000);
	try {  
		 WebElement reminderbellicon = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='notifications_active'])[14]"));		  			  
		 boolean remindericondisplay = reminderbellicon.isDisplayed();
 	  	if(remindericondisplay) {
 	  	reminderbellicon.click();
 	  		  }}
		catch (Exception e) {
		WebElement threedotelement = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[7]"));
		threedotelement.click();
        WebElement reminderclick = driver.findElement(By.xpath("//span[normalize-space()='Reminder']"));
	        reminderclick.click();
        Thread.sleep(3000);
		  	   } 
		finally {
		System.out.println("is displayed");
		  	  }
	    Thread.sleep(4000);
	  		driver.findElement(By.xpath("//mat-label[normalize-space()='Set Frequency']")).click();
	  		Thread.sleep(8000);
	  try {  
	  WebElement periodelement = driver.findElement(By.xpath("(//span[normalize-space()='Yearly'])[1]"));		  			  
	  boolean perioddisplay = periodelement.isDisplayed();
	  if(perioddisplay) {
		 periodelement.click();
	  }}
	   catch (ElementClickInterceptedException e) {
	  WebElement pseudoelement = driver.findElement(By.xpath("(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-mdc-option-pseudo-checkbox mat-pseudo-checkbox-checked mat-pseudo-checkbox-minimal ng-star-inserted'])[1]"));
	  pseudoelement.click();
	   } 
	  finally {
		  System.out.println("is displayed");
	  }
	  Thread.sleep(4000);

	     	driver.findElement(By.xpath("(//mat-datepicker-toggle[starts-with(@class,'mat-datepicker-toggle ng-tns')])[1]")).click();
	     	Thread.sleep(4000);  		
	  	    driver.findElement(By.xpath("//button[@aria-current='date'][1]")).click();
	  	    Thread.sleep(4000);
	     	driver.findElement(By.xpath("//mat-label[normalize-space()='Start Time*']")).click();
	     	Actions actionsrem = new Actions(driver);
			actionsrem.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
			sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(2000);
			actionsrem.sendKeys("05:15 PM").build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//li[@class='ui-menu-item ng-star-inserted'])[1]")).click();
			Thread.sleep(2000);
	     	driver.findElement(By.xpath("(//mat-datepicker-toggle[starts-with(@class,'mat-datepicker-toggle ng-tns')])[2]")).click();
	     	Thread.sleep(3000);
	     	driver.findElement(By.xpath("(//button[@aria-label='Next month'])[1]")).click();
	     	driver.findElement(By.xpath("(//button[@aria-label='Next month'])[1]")).click();
	     	driver.findElement(By.xpath("(//button[@aria-label='Next month'])[1]")).click();
	     	driver.findElement(By.xpath("(//button[@aria-label='Next month'])[1]")).click();		  	     	
	     	driver.findElement(By.xpath("//span[normalize-space()='13']")).click();
	     	Thread.sleep(4000);
	     	driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
	     	Thread.sleep(4000);
	     	driver.close();
	 }
	}