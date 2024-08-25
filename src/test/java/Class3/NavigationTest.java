package Class3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().window().maximize();



       WebDriver.Navigation navigate= driver.navigate();

       navigate.to("https://www.saucedemo.com/");      //This is not mandatory.
       Thread.sleep(2000);

        navigate.back();
       Thread.sleep(200);

       navigate.forward();
        Thread.sleep(2000);

        navigate.refresh();
        Thread.sleep(2000);

        /*
        Or
         driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to(url"");
        */


        driver.quit();

    }
}






