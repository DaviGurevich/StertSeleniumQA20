package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumXpathIlCarro {

    WebDriver driver;

    @BeforeClass
    public void preconditions() {

        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

        @Test
        public void testXpath() {
            System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
            driver.findElements(By.xpath("//*[text() = 'Find your car now!']"));
            driver.findElements(By.xpath("//*[contains(text(), 'now!')]"));

            driver.findElement(By.xpath("//input[@id='city']"));
            List<WebElement> listInputs = driver.findElements(By.xpath("//input[@id]"));
            System.out.println("langsoflistof inputs with id" + listInputs.size());

        }

        @AfterClass
        public void postConditions() {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }
    }


