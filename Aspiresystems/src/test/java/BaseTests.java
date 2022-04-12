import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {

    WebBase base = new WebBase();

@BeforeTest
    public void initiateDriver(){
        base.launchBrowser();
}

@AfterTest
    public void closeWindow(){
    base.tearDown();
    }

}
