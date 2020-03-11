package browsertesting;
/*
firefox browser testing to open https://www.nopcommerce.com/demo website
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTest {
    public static void main(String[] args) {

        String baseURL1 = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseURL1);
        driver.quit();
    }
}
