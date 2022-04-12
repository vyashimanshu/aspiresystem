import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;


public class WebActions {

    public void enterText(String element, String text) {
        //driver.findElement(element).sendKeys(text);
        WebBase.driver.findElement(By.id(element)).sendKeys(text);
    }

    public void enterTextWithXpath(String element, String text) {
        WebBase.driver.findElement(By.xpath(element)).sendKeys(text);
    }

    public void clickOnElement(String element) {
      //  WebBase.driver.findElement(By.xpath(element)).isDisplayed();
        WebBase.driver.findElement(By.xpath(element)).click();
    }


    public boolean isDisplayedOnUI(String element) {
        return WebBase.driver.findElement(By.xpath(element)).isDisplayed();
    }


    public String generateRandom() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(generatedString);
        return generatedString;
    }

    public void clickOnCreateProduct(String name){
        WebBase.driver.findElement(By.xpath("//ul/li[2]/a/strong[text() ='"+name+"']")).click();
    }

    public void clearPlaceholder(String element){
        WebBase.driver.findElement(By.xpath(element)).clear();
    }

    public void searchCreateProduct(String name){
        WebBase.driver.findElement(By.xpath("//a[text() ='"+name+"']")).click();
    }

    public String checkDisabled(String element) {
        return WebBase.driver.findElement(By.xpath(element)).getAttribute("aria-checked");
    }

    public void waitForElement(String element){
        WebDriverWait wait = new WebDriverWait(WebBase.driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(element)));

    }
}