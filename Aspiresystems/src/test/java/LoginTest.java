import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {
    WebBase base = new WebBase();
    WebActions actions = new WebActions();
    static String username = "login";
    String passwd = "password";
    String loginBtn = "//button[text()='Log in']";
    String test = actions.generateRandom();

    /**
     * Method is use to login, create new product update is value and marking the products as done
    */
    @Test
    public void login() throws InterruptedException {
        actions.enterText(username,"user@aspireapp.com");
        actions.enterText(passwd,"@sp1r3app");
        actions.clickOnElement(loginBtn);
        actions.clickOnElement(ProductActivity.inventery);
        actions.clickOnElement(ProductActivity.productsMenu);
        actions.waitForElement(ProductActivity.productSubMenu);
        actions.clickOnElement(ProductActivity.productSubMenu);
        actions.waitForElement(ProductActivity.craeteRecord);
        actions.clickOnElement(ProductActivity.craeteRecord);
        actions.waitForElement(ProductActivity.enterProduct);
        actions.enterTextWithXpath(ProductActivity.enterProduct,test);
        actions.clickOnElement(ProductActivity.saveRecord);
        actions.waitForElement(ProductActivity.updateQuantity);
        Thread.sleep(4000);
        actions.clickOnElement(ProductActivity.updateQuantity);
        actions.waitForElement(ProductActivity.createSubBtn);
        actions.clickOnElement(ProductActivity.createSubBtn);
        actions.waitForElement(ProductActivity.enterQunatityVal);
        actions.clearPlaceholder(ProductActivity.enterQunatityVal);
        actions.enterTextWithXpath(ProductActivity.enterQunatityVal,"11");
        actions.waitForElement(ProductActivity.saveRecord);
        actions.clickOnElement(ProductActivity.saveRecord);
        actions.waitForElement(ProductActivity.HomeMenu);
        actions.clickOnElement(ProductActivity.HomeMenu);
        actions.clickOnElement(ProductActivity.manufacturing);
        actions.clickOnElement(ProductActivity.createSubBtn);
        actions.waitForElement(ProductActivity.productSearchField);
        actions.enterTextWithXpath(ProductActivity.productSearchField,test);
        actions.searchCreateProduct(test);
        actions.waitForElement(ProductActivity.saveRecord);
        actions.clickOnElement(ProductActivity.saveRecord);
        Thread.sleep(4000);
        actions.waitForElement(ProductActivity.confirm);
         actions.clickOnElement(ProductActivity.confirm);
        Thread.sleep(4000);
        actions.waitForElement(ProductActivity.markAsDone);
        actions.clickOnElement(ProductActivity.markAsDone);
        actions.waitForElement(ProductActivity.ok);
        actions.clickOnElement(ProductActivity.ok);
        actions.waitForElement(ProductActivity.apply);
        actions.clickOnElement(ProductActivity.apply);
        Thread.sleep(4000);
        Assert.assertEquals("true",actions.checkDisabled(ProductActivity.done));

    }
}
