package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utlilities.Utility;

public class ForgotPasswordTest extends Utility {
    //Opening selected browser  before every test
    @Before
    //Enter url and one of the browser 'Chrome', 'Firefox', 'Edge' in the arguments
    public void openTheSelectedBrowser() {
        browserSetup("https://opensource-demo.orangehrmlive.com/", "Edge");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        String expectedText = "Reset Password";
        clickOnTheElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String actualText = verifyText(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
        Assert.assertEquals(expectedText, actualText);
    }

    //Closing the browser after each test
    @After
    public void quitBrowser() {
        closingTheBrowser();
    }
}
