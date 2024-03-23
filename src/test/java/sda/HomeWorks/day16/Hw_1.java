package sda.HomeWorks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.Utillities.TestBase;

public class Hw_1 extends TestBase {


    @Test
    @Parameters({"ProgramLanguage","Assert"})
 public void test_HW1(String ProgramLanguage , String Assert){
        //Go to URL: https://www.google.com
        driver.get("https://www.google.com");
        //Search words: Java , Selenium
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(ProgramLanguage);
        driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
        WebElement title = driver.findElement(By.xpath(Assert));
        //Assert get text result est that the result text contains the searched Word.
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(title.isDisplayed());
        sa.assertAll();
        //Run tests from XML file.

    }

}
