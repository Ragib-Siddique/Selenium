package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FormTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



        driver.findElement(By.id("firstName")).sendKeys("ssssssss");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("label[for='gender-radio-2']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("dateOfBirthInput")).click();

        Select select=new Select(driver.findElement(By.className("react-datepicker__month-select")));
        select.selectByValue("4");

        driver.findElement(By.className("react-datepicker__day react-datepicker__day--022")).click();
        Thread.sleep(2000);

        new Actions(driver).moveToElement(driver.findElement(By.className("css-1uccc91-singleValue"))).click().perform();
        driver.findElement(By.id("react-select-3-option-2")).click();

        driver.quit();


    }
}
