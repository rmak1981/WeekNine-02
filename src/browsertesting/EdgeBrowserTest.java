package browsertesting;
/*
Edge browser testing to open https://www.nopcommerce.com/demo
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[]args){
        String baseUrl3 = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.msedge.driver","drivers/msedgedriver (1).exe");
        WebDriver Driver = new EdgeDriver();
        Driver.manage().window().maximize();
        Driver.get(baseUrl3);

    }
}

