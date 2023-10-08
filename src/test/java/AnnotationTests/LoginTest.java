package AnnotationTests;

import AnnotationBase.BaseTest;
import AnnotationPages.Homepage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://practicetestautomation.com/");
    }

    @Test(priority = 10)
    public void userCanLogInAndLogOut() {
        homepage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageButton();
        loginPage.inputUsername("student");
        loginPage.inputPassword("Password123");
        loginPage.clicOnSubmitButton();
        Assert.assertTrue(profilePage.logoutButton.isDisplayed());
        Assert.assertTrue(profilePage.message.isDisplayed());
        profilePage.clickOnLogoutButton();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.loginPageURL());
    }
}
