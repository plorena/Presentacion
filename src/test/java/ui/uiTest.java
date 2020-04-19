package ui;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class uiTest {
    WebDriver driver = null;

    private void startDriver(String urlParaTest) throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new RemoteWebDriver(new URL("http://localhost:4411/wd/hub"), chromeOptions);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(urlParaTest);
        driver.manage().window().maximize();
        driver.navigate().refresh();
    }

    @Test
    public void testNewtours() throws Exception {

        startDriver("http://newtours.demoaut.com/");


        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(3) > td:nth-child(1) > img"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td > font"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(5) > td:nth-child(1) > img"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(6) > td > table > tbody > tr > td:nth-child(2) > font"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(7) > td:nth-child(1) > img"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(8) > td > table > tbody > tr > td:nth-child(2) > font"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(1) > td > font"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(1) > p:nth-child(1) > img"));



        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(1)")).click();

        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(2)")).click();

        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(3)")).click();

        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(4)")).click();


        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > img"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font:nth-child(1) > b > font:nth-child(1)"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font:nth-child(2) > font:nth-child(2) > font"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > div"));
        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > a > img"));


        get(new By.ByCssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(2)")).click();


        get(new By.ByName("firstName")).sendKeys("paul");
        get(new By.ByName("lastName")).sendKeys("lorena");
        get(new By.ByName("phone")).sendKeys("12345");
        get(new By.ByName("userName")).sendKeys("paul.lorena");
        get(new By.ByName("address1")).sendKeys("Av. ABC 123");
        get(new By.ByName("city")).sendKeys("Bruselas");
        get(new By.ByName("state")).sendKeys("Bruselas");
        get(new By.ByName("postalCode")).sendKeys("1300");
        get(new By.ByName("country")).sendKeys("BELGIUM");
        get(new By.ByName("email")).sendKeys("paul.lorena@gmail.com");
        get(new By.ByName("password")).sendKeys("paul123!");
        get(new By.ByName("confirmPassword")).sendKeys("paul123!");
        get(new By.ByName("register")).click();

        Thread.sleep(5000000);
    }

    @Test
    public void testCalculadora() throws Exception {

        startDriver("http://www.math.com/students/calculators/source/basic.htm");


        get(new By.ByName("one"));
        get(new By.ByName("two"));
        get(new By.ByName("three"));
        get(new By.ByName("four"));
        get(new By.ByName("five"));
        get(new By.ByName("six"));
        get(new By.ByName("seven"));
        get(new By.ByName("eight"));
        get(new By.ByName("nine"));
        get(new By.ByName("zero"));
        get(new By.ByName("times"));
        get(new By.ByName("clear"));
        get(new By.ByName("div"));
        get(new By.ByName("minus"));
        get(new By.ByName("plus"));
        get(new By.ByName("DoIt"));
        get(new By.ByName("Input"));


        get(new By.ByName("seven")).click();
        get(new By.ByName("plus")).click();
        get(new By.ByName("eight")).click();
        get(new By.ByName("DoIt")).click();

    }



    private void highlightElement(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
        } catch (Exception e) {
        }
    }

    protected WebElement get(By findBy) throws InterruptedException {
        Thread.sleep(500);
        WebElement element = null;
        try {
            element = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(findBy));

        } catch (Exception e) {

        }

        if (element != null)
            highlightElement(element);
        return element;
    }


}
