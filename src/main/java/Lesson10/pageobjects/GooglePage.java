package Lesson10.pageobjects;

import Lesson10.stepdefinition.LoginTestStepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

//import static Lesson10.Lesson10.driver;
import static Lesson10.stepdefinition.LoginTestStepDefinition.driver;

public class GooglePage extends AbstractPage{



    public GooglePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")
    private WebElement googleSearch;




    public void runssearch(String searchby){
        searchField.sendKeys(searchby);
        searchField.sendKeys(Keys.ENTER);

    }



}

