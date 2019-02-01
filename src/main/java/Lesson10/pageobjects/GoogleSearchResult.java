package Lesson10.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import static Lesson10.Lesson10.driver;
import static Lesson10.stepdefinition.LoginTestStepDefinition.driver;

public class GoogleSearchResult extends AbstractPage {

    public GoogleSearchResult () {
       PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[1]//table/tbody/tr[2]/td[1]//span//a")
    private WebElement link;

    public void clickFacebookLink(){
       link.click();
    }
}
