package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabTest {
    public static void main (String [] args) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();


       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  Implicitly wait //

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));


        String parentPage=driver.getWindowHandle();
        driver.getWindowHandles();
        WebElement element=driver.findElement(By.className("text-center"));
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println("Main Window :"+driver.findElement(By.className("text-center")).getText());

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/sample");
        System.out.println("Child Window:"+driver.findElement(By.id("sampleHeading")).getText());


        driver.switchTo().window(parentPage);
        Thread.sleep(2000);

        driver.quit();

    }
}
