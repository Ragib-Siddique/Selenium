package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ParaBankTagTest {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=23E470A0D6E69946BA23D2013959D91E");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println("count: " +webElements.size());
        for (WebElement element:webElements){
            System.out.println(element.getText()+ " "+element.getAttribute("href"));
        }
        /*
        *getText() <a>text under anchor</a>  return:text under anchor
        getattribute("id") <a id="usingID">text under anchor </a>  Return:Using ID
        */

        driver.quit();


    }
}
