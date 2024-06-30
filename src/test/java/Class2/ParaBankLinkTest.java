package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParaBankLinkTest {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=23E470A0D6E69946BA23D2013959D91E");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.linkText("Register")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.partialLinkText("got log")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
