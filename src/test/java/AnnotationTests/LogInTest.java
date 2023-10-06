package AnnotationTests;

import AnotationBase.BaseTest;
import org.testng.annotations.BeforeMethod;

public class LogInTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");

    }

}
