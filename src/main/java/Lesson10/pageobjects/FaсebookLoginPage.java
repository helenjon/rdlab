package Lesson10.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import static Lesson10.Lesson10.driver;
import static Lesson10.stepdefinition.LoginTestStepDefinition.driver;

public class FaсebookLoginPage extends AbstractPage{


    public FaсebookLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "email")
    private WebElement emailField;

    @FindBy (name = "pass")
    private WebElement passwordField;

    @FindBy(id = "loginbutton")
    private WebElement loginbutton;

    @FindBy(xpath = "//div[@class=\"_4rbf _53ij\"]")
    public WebElement w;

    public void entercredentials (String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);

    }


    public void clickLogin(){
        loginbutton.click();
    }





}
