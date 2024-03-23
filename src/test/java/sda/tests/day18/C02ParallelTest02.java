package sda.tests.day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sda.Utillities.TestBase;

public class C02ParallelTest02 extends TestBase {
    // i should bout new ChromeDriver for etch methode like the fist method

    @Test
    public void test01(){

        new ChromeDriver().get("https://www.clarusway.com");
    }
    @Test
    public void test02(){

        driver.get("https://www.ebay.com");
    }
    @Test
    public void test03(){

        driver.get("https://www.linkedin.com");
    }
    @Test
    public void test04(){

        driver.get("https://www.google.com");
    }
}