package sda.HomeWorks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test ;
import org.testng.asserts.SoftAssert;
import sda.Utillities.TestBase;

import java.util.logging.Handler;

public class Hw_2 extends TestBase {

    @Test
    @Parameters({"username","password"})
    public void test(String username , String password){
        String Handel = driver.getWindowHandle();
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
        //Type username student into Username field
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        //Type password Password123 into Password field
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        //Click Submit button.
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        WebElement successfullyMasseg = driver.findElement(By.xpath("//h1[@class='post-title']"));
        driver.switchTo().window(Handel);
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(successfullyMasseg.isDisplayed());
        sa.assertAll();
        //You should execute this test with xml file (edited)
    }
}
