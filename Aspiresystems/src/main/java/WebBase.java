import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public final class WebBase {

    public static WebDriver driver;

    public void launchBrowser() {
            WebDriverManager.chromedriver().setup();
            driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://aspireapp.odoo.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }



    public void tearDown(){
        driver.close();
    }

}
