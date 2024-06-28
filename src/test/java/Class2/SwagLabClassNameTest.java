package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagLabClassNameTest {

    public static void main(String[] args) {
        WebDriver cloud=new FirefoxDriver();
       cloud.get("https://www.saucedemo.com/");
       cloud.manage().window().maximize();
        System.out.println(cloud.getTitle());
        System.out.println(cloud.getCurrentUrl());


        cloud.findElement(By.name("user-name")).sendKeys("standard_user");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cloud.findElement(By.name("password")).sendKeys("secret_sauce");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        cloud.findElement(By.className("submit-button")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        cloud.quit();



    }
}
