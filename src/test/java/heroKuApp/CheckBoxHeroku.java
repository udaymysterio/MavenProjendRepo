package heroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckBoxHeroku {
	
	WebDriver driver;
	JavascriptExecutor jsDriver;
	
//	 public CheckBoxHeroku(WebDriver driver) {
//			this.driver = driver;
		//	jsDriver = (JavascriptExecutor) driver;
	// }
	 
	@Test(priority = 1)
	public void CheckUncheckBox() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li//a[text()='Checkboxes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test(priority = 2)
	public void AddRemoveElement() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li//a[text()='Add/Remove Elements']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(2000);
		driver.close();
}
	@Test(priority = 3)
	public void BasicAuth() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li//a[text()='Basic Auth']")).click();
		Thread.sleep(4000);
		driver.close();
}
	@Test(priority = 4)
	public void DisappearElement() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li//a[text()='Disappearing Elements']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li//a[text()='Home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li//a[text()='Disappearing Elements']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li//a[text()='Contact Us']")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority = 5)
	public void FormAuthenticate() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li//a[text()='Form Authentication']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("loginuser");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("loginpassword");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test(priority = 6)
	public void Inputs() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li//a[text()='Inputs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).click();
		Thread.sleep(2000);
		Actions actionify = new Actions(driver);
//		actioner.click(epagescroll).build().perform();
		actionify.sendKeys("565645").perform();
		Thread.sleep(2000);
		actionify.sendKeys(Keys.ARROW_DOWN).perform();
		actionify.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		actionify.sendKeys(Keys.ARROW_UP).perform();
		actionify.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		actionify.sendKeys(Keys.ARROW_DOWN).perform();
		actionify.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		driver.close();
}
	@Test(priority = 7)
	public void ePageScroll() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li//a[text()='Infinite Scroll']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html[@class='no-js'][1]")).click();
//		Thread.sleep(2000);
		Actions actioner = new Actions(driver);
//		actioner.click(epagescroll).build().perform();
		actioner.sendKeys(Keys.ARROW_DOWN).perform();
		actioner.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		actioner.sendKeys(Keys.ARROW_UP).perform();
		actioner.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		actioner.sendKeys(Keys.ARROW_DOWN).perform();
		actioner.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		driver.close();
//		JavascriptExecutor Jscr = (JavascriptExecutor) driver;
//		Jscr.executeScript("arguments[0].scrollIntoView(true);", epagescroll);
}}