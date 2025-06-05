package heroKuApp;

import baseSetPackage.BaseSetTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v130.page.Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import pracprogPage.SigninPage;

public class DisplayTest extends BaseSetTest {
    public DisplayTest() {
        super();
    }
    @Test
    public void signIn() {
        SigninPage obj = new SigninPage(driver);
        obj.enterCred();
    }
    @Test
    public void validateDashboard() {
        String act = "actualValue";
        String exp = "expectedValue";
        Assert.assertEquals(act, exp);

        WebElement newWireBtn = driver.findElement(By.id("newWireBtn"));
        boolean newWire = newWireBtn.isDisplayed();
        Assert.assertTrue(newWire);
    }
}
