package omayoweb;

import baseSetPackage.BaseSetTest;
import mavenProjSet.ListenerPro;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pracprogPage.OmayowebPage;

@Listeners(ListenerPro.class)
public class OmayoWebTest extends BaseSetTest implements ITestListener {
    public OmayoWebTest() {
        super();
    }
    @Test
    public void signOmayo() throws InterruptedException {
        OmayowebPage obj = new OmayowebPage(driver);
        obj.entername();
    }
}
