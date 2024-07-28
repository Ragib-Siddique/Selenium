package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabTest {
    public static void main (String [] args) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        String parentPage=driver.getWindowHandle();
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
