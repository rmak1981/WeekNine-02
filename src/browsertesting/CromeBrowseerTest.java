package browsertesting;
/*
Chrome browser testing to open https://www.nopcommerce.com/demo website
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowseerTest {

    public static void main(String[] args) {

        String baseURL1 = "https://www.nopcommerce.com/demo"; // url to open in chrome brsr

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); // path for chrome driver

        WebDriver driver = new ChromeDriver(); // web driver for chrome

        driver.manage().window().maximize();// managing open window with maximise browser

        driver.get(baseURL1); // get command to open base url
    }

}
