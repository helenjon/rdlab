package Lesson10.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomChromeDriver implements webdriver {

    private WebDriver driver;

    @Override
    public WebDriver newDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en-us");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }


}
