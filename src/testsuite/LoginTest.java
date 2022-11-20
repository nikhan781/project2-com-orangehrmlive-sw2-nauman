package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utlilities.Utility;

public class LoginTest extends Utility {
    //Opening the browser in selected browser before every test
    @Before
    public void startBrowser() {
        //Enter url and one of the browser 'Chrome', 'Firefox', 'Edge' in the arguments
        browserSetup("https://opensource-demo.orangehrmlive.com/", "Chrome");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        String expectedMessage = "Dashboard";
        //Enter username
        enterTextInElement(By.name("username"), "Admin");
        //Enter password
        enterTextInElement(By.name("password"), "admin123");

        //Click on login button
        clickOnTheElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));

        //Verify the 'Dashboard' text is displayed
        String actualText = verifyText(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        Assert.assertEquals(expectedMessage, actualText);
    }

    //Closing the browser after each test
    @After
    public void quitBrowser() {
        closingTheBrowser();

    }
}
