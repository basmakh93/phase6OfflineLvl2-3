package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTests extends BaseTests {
    @Test
    public void testLogin() throws FileNotFoundException {
        LoginPage loginPage=homePage.clickOnLoginLink();
        loginPage.loginFeatures(dataModel().Login.ValidLoginCredentials.Username,
                dataModel().Login.ValidLoginCredentials.Password);
        loginPage.clickOnLoginButton();
    }
}
