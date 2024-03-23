package sda.HomeWorks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.Utillities.TestBase;

public class Hw_2 extends TestBase {

    /*
            Test Case2: Negative Username Test
            Open page https://practicetestautomation.com/practice-test-login/
            Type username incorrectUser into Username field.
            Type password Password123 into Password field.
            Click Submit button.
            Verify error message is displayed.
            Verify error message text is Your username is invalid!

         */
    @Test
    public void UsernameTest(){
        By userName = By.xpath("//input[@id='username']");
        By Password = By.xpath("//input[@id='password']");
        By submit = By.xpath("//button[@id='submit']");
        WebElement RedBox = driver.findElement(By.xpath("//div[@id='error']"));
        WebElement Massage = driver.findElement(By.partialLinkText("Your username is invalid!"));

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(userName).sendKeys("students");
        driver.findElement(Password).sendKeys("Password123");
        driver.findElement(submit).click();

        SoftAssert sa = new SoftAssert();
        sa.assertTrue(RedBox.isDisplayed());
        sa.assertTrue(Massage.isEnabled());

    }
}
