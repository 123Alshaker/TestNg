package sda.HomeWorks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.Utillities.TestBase;
public class Hw1_HardVsSoftAssertion extends TestBase {
    /*
Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Click Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page.
*/

    @Test
    public void softAssertion(){
        //
        //Test Case1: Positive Login Test
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        //Type password Password123 into Password field
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        //Click Submit button.
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        SoftAssert sa = new SoftAssert();
        String expactedUrl = "https://practicetestautomation.com/practice-test-login/";
        String actualUle = driver.getCurrentUrl();
        Assert.assertEquals(expactedUrl,actualUle);
        sa.assertEquals(expactedUrl,actualUle);
        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement massage = driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']"));
        System.out.println("log in page is pass");
        sa.assertTrue(massage.isDisplayed());
        //Verify button Log out is displayed on the new page.
        WebElement button = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
        System.out.println("log out is displayed");
        sa.assertTrue(button.isDisplayed());
        sa.assertAll();


    }

    @Test
    public void hardAssertion(){
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        //Type password Password123 into Password field
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        //Click Submit button.
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String expactedUrl = "https://practicetestautomation.com/practice-test-login/";
        String actualUle = driver.getCurrentUrl();
        Assert.assertEquals(expactedUrl,actualUle);
        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement massage = driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']"));
        Assert.assertTrue(massage.isDisplayed(),"log in page is pass");
        //Verify button Log out is displayed on the new page.
        WebElement button = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
        Assert.assertTrue(button.isDisplayed(),"log out is displayed");
    }




}