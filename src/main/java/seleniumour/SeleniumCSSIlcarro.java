package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumCSSIlcarro {

    WebDriver driver;

    @Test
    public void test1() {
        driver = new ChromeDriver();
        driver.navigate().to( "https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 60, TimeUnit.SECONDS);

        WebElement h2TextElement = driver.findElement(By.cssSelector("h2")); // tag name
        System.out.println(h2TextElement.getText());

        WebElement h2ByTagName = driver.findElement(By.tagName("h2"));

        WebElement h2TexElementByClass = driver.findElement(By.cssSelector(".subtitle")); // class value
        System.out.println(h2TexElementByClass.getText());



        WebElement h2TexElementByClassName = driver.findElement(By.className("subtitle"));
        System.out.println(h2TexElementByClassName.getText());

        WebElement h2ByClassAndTagTogether = driver.findElement(By.cssSelector("h2.subtitle"));

        WebElement inputCityById = driver.findElement(By.cssSelector("#city")); // id value
        System.out.println(inputCityById.getAttribute("type"));

        WebElement inputCityByIdDirectly = driver.findElement(By.id("city")); // id value
        System.out.println(inputCityByIdDirectly.getAttribute("type"));

        WebElement wildElementAttribute = driver.findElement(By.cssSelector("[style='touch-action: none; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);")); // full attribute



//        WebElement h2ByText = driver.findElement(By.linkText("Type your data and hit Yalla!"));
        WebElement h2ByText = driver.findElement(By.partialLinkText("hit"));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // xpath

        WebElement xpath2 = driver.findElement(By.xpath( "//label[@for='city']"));
        // //label[@for='city']/.. --> jump one tag up

        WebElement xpathLable = driver.findElement(By.xpath( "//label[@for='city']"));
        // //label[@for='city']/.. --> jump one tag up

        System.out.println(xpathLable.getText());


        driver.quit();

    }
}
