package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://practicetestautomation.com/");
    }

    @Test
    public void verifyThatUserCanLogIn() {
        homepage.clickOnPracticeButton();
        practicePage.clickOnTestLoginButton();
        loginPage.inputUsername("student");
        loginPage.inputPassword("Password123");
        loginPage.clickOnSubmitButton();
        Assert.assertTrue(profilePage.getMessage().isDisplayed());
        Assert.assertTrue(profilePage.getLogoutButton().isDisplayed());

    }

}
