package Lesson10.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaсebookLoginPage extends AbstractPage{

    private WebDriver driver;

    public FaсebookLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    @FindBy (name = "email")
    private WebElement emailField;

    @FindBy (name = "pass")
    private WebElement passwordField;

    @FindBy(id = "loginbutton")
    private WebElement loginbutton;

    @FindBy(xpath = "//div[@class=\"_4rbf _53ij\"]")
    public WebElement errorMesage;

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginbutton() {
        return loginbutton;
    }

    public WebElement getErrorMesage() {
        return errorMesage;
    }

    public void login (String email, String password){
        getEmailField().sendKeys(email);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginbutton.click();
    }





}
