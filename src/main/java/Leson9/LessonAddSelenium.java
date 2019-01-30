package Leson9;


//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LessonAddSelenium {

        public static WebDriver driver;

    public static void main(String [] args){
//     WebDriverManager.chromedriver().setup();
      // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://google.com");
        //driver.findElement(By.xpath("//input[@name='q']"));
        driver.findElement(By.name("q")).sendKeys("epam");
        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@value='Пошук Google']")).click();
        driver.quit();
    }


}
