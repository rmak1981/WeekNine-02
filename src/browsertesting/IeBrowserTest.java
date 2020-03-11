package browsertesting;
/*
IE browser testing to open https://www.nopcommerce.com/demo website
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowserTest {
    public static void main(String[] args) {

        String baseURL1 = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseURL1);
        driver.quit();
    }
}
