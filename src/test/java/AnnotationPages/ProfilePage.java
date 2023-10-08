package AnnotationPages;

import AnnotationBase.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseTest {
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log out")
    public WebElement logoutButton;

    @FindBy(className = "has-text-align-center")
    public WebElement message;

//    **********************************************

    public void clickOnLogoutButton() {
        logoutButton.click();
    }



}


