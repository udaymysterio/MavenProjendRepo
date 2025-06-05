package pracprogPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OmayowebPage {
    WebDriver driver;

    @FindBy(id = "ta1")
    WebElement username;

    public OmayowebPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void entername() throws InterruptedException {
        username.click();
        username.sendKeys("Uday kumar bajji");
        username.clear();
        Thread.sleep(3000);
    }
}

