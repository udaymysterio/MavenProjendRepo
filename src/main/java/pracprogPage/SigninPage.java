package pracprogPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
    WebDriver driver;

    @FindBy(id = "userId")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(id = "signBtn")
    WebElement signBtn;

    public SigninPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterCred() {
        username.clear();
        username.sendKeys("abc@gmail.com");
        password.clear();
        password.sendKeys("xyz12345");
        signBtn.click();
    }
}
