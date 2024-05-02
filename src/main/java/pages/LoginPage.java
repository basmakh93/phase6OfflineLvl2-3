package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By emailField=By.cssSelector(".email");
    private final By passwordField=By.cssSelector(".password");
    private final By loginButton=By.cssSelector(".button-1.login-button");
    public void insertEmail(String email){
        sendKeys(emailField,5,email);
    }
    public void insertPassword(String password){
        sendKeys(passwordField,5,password);
    }
    public void clickOnLoginButton(){
        click(loginButton,5);
    }
    public void loginFeatures(String email,String password){
        insertEmail(email);
        insertPassword(password);
        clickOnLoginButton();
    }
}
