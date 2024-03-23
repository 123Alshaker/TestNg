package sda.HomeWorks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.Utillities.TestBase;

public class Hw_3 extends TestBase {



    @Test
    @Parameters({"username", "password"})
    public void Test1(String username, String password) {


        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        //Try to login with correct user name and wrong password
        WebElement ErrorMesseg = driver.findElement(By.xpath("//div[@id='error']"));
        Assert.assertTrue(ErrorMesseg.isDisplayed());

    }

    @Test
   @Parameters({"username", "password"})
    public void Test2(String username, String password) {


        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        //And wrong user name and correct password
        WebElement ErrorMesseg = driver.findElement(By.xpath("//div[@id='error']"));
        Assert.assertTrue(ErrorMesseg.isDisplayed());
    }


    @Test
    @Parameters({"username", "password"})
    public void Test3(String username, String password) {

        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        //And wrong user name and wrong password
        WebElement ErrorMesseg = driver.findElement(By.xpath("//div[@id='error']"));
        Assert.assertTrue(ErrorMesseg.isDisplayed());

    }

    @Test
    @Parameters({"username", "password"})
    public void Test4(String username, String password) {


        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        //And empty user name correct password
        //Verify error message is displayed.
        WebElement ErrorMesseg = driver.findElement(By.xpath("//div[@id='error']"));
        Assert.assertTrue(ErrorMesseg.isDisplayed());
    }
}
