package Lesson10.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Lesson10.stepdefinition.LoginTestStepDefinition.driver;

public class FacebookMainPage extends AbstractPage  {

    public FacebookMainPage() {
        PageFactory.initElements(driver, this);
    }


}
