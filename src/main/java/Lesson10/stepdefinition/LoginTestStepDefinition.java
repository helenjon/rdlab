package Lesson10.stepdefinition;

import Lesson10.pageobjects.FacebookMainPage;
import Lesson10.pageobjects.FaсebookLoginPage;
import Lesson10.pageobjects.GooglePage;
import Lesson10.pageobjects.GoogleSearchResult;
import Lesson10.webdrivers.CustomChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

public class LoginTestStepDefinition extends CustomChromeDriver {


    public static WebDriver driver;
    private GooglePage googlePageElements;
    private FaсebookLoginPage faceBookLoginPage;
    private GoogleSearchResult googleSearchResult;
    private FacebookMainPage faceBookMainPage;

    @Before
    public void beforetest() {
        driver = newDriver();
    }

    @Given("^I am on the Chrome search page$")
    public void iAnOnChromePage() {
        driver.get("https://www.google.com");
    }

    @When("^I enter \"([^\"]*)\" in search field, run search, click login to Facebook$")
    public void enterFacebook(String searchdata) {
        googlePageElements = new GooglePage();
        googlePageElements.runssearch(searchdata);
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        googleSearchResult = new GoogleSearchResult();
        googleSearchResult.clickFacebookLink();


    }

    @And("^enter \"([^\"]*)\" and \"([^\"]*)\" to login$")
    public void enterLoginAndPass(String login, String password) {
        faceBookLoginPage = new FaсebookLoginPage();
        faceBookLoginPage.entercredentials(login, password);
        faceBookLoginPage.clickLogin();
    }


    @Then("^I should see url contains \"([^\"]*)\"$")
    public void iShouldSeeUrlContains(String test) throws Throwable {
        System.out.println(faceBookLoginPage.w.getAttribute("textContent"));
        assertEquals(test, faceBookLoginPage.w.getAttribute("textContent"));
        throw new PendingException();
    }


    @After
   public void quit(){
        driver.quit();
   }


    @Then("^I should see \"([^\"]*)\" contains$")
    public void iShouldSeeContains(String url) throws Throwable {
        System.out.println(driver.getCurrentUrl());
        assertEquals(url, driver.getCurrentUrl());
        throw new PendingException();
    }
}
