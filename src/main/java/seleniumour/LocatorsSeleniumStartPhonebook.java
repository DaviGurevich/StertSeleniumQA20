package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsSeleniumStartPhonebook {

    WebDriver driver;

    @Test
    public void test1() {
        driver = new ChromeDriver();
        driver.navigate().to( "https://telranedu.web.app/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 60, TimeUnit.SECONDS);

        WebElement h1TextElement = driver.findElement(By.cssSelector("h1"));
        System.out.println(h1TextElement.getText());

        WebElement h1TextElementTag = driver.findElement(By.tagName("h1"));
        System.out.println(h1TextElement.getText());

        WebElement h1TextElementClass= driver.findElement(By.cssSelector(".active"));
        System.out.println(h1TextElementClass.getText());

        WebElement h1TextElementClassName = driver.findElement(By.className("active"));
        System.out.println(h1TextElementClassName.getText());

        WebElement inputNameById = driver.findElement(By.id("root"));
        System.out.println(inputNameById.getClass());
        System.out.println(inputNameById.getText());





        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();
    }
}
