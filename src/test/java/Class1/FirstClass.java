package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("http://www.google.com");

        Thread.sleep(5000);
        driver.quit();
    }
}
