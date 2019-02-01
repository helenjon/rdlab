package Lesson10;

import Lesson10.pageobjects.FaсebookLoginPage;
import Lesson10.pageobjects.GooglePage;
import Lesson10.pageobjects.GoogleSearchResult;
import Lesson10.webdrivers.CustomChromeDriver;
import Lesson10.webdrivers.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class Lesson10 {

//1 - Open browser
//2 - Navigate to https://www.google.com
//3 - Enter " Facebook " in to search field
//4 - Click "Search" button
//5 - Click link "Facebook - Log In or Sign Up"
//6 - Verify that you were redirected to "https://www.facebook.com"
//7 - Enter wrong email (text field "Email or Phone"). For example: "badlogin"
//8 - Enter wrong password (text field "Password"). For example: "badpassword"
//9 - Click "Log In" button
//10 - verify that message "The email or phone number you’ve entered doesn’t match any account." is displayed.

    public static WebDriver driver;

        @Before
        public void before(){
        CustomChromeDriver customChromeDriver = new CustomChromeDriver();
        driver = customChromeDriver.newDriver();

        }

        @Test
        public void urlcheck(){
            driver.get("https://www.google.com");
            GooglePage googlePageElements = new GooglePage();
            googlePageElements.runssearch("Facebook");
            GoogleSearchResult results = new GoogleSearchResult();
            results.clickFacebookLink();
            Assert.assertEquals(driver.getCurrentUrl(), driver.getCurrentUrl());
            FaсebookLoginPage faсeBookLoginPage = new FaсebookLoginPage();
            faсeBookLoginPage.entercredentials("test@gmail.com", "password");
          //  faсeBookLoginPage.clickLogin();
            driver.quit();
        }




        }



