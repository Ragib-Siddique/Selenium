package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebinfoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

//        Conventional way:
//        System.out.println("Tag Name:"+ driver.findElement(By.id("user-name")).getTagName());
//        System.out.println("X,Y Name:"+driver.findElement(By.id("user-name")).getRect().x + " " +driver.findElement(By.id("user-name")).getRect().y);

//        optimistic way:
        WebElement webElement=driver.findElement(By.id("user-name"));
        System.out.println("Tag Names" +webElement.getTagName());
        System.out.println("X,Y value:"+webElement.getRect().x +""+webElement.getRect().y);



        WebElement element=driver.findElement(By.id("login-button"));
        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("font-size"));
        System.out.println(element.getAttribute("class"));

        driver.quit();
    }
}
