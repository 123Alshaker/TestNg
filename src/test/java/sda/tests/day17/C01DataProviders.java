package sda.tests.day17;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.Utillities.TestBase;
//Go to URL: https://opensource-demo.orangehrmlive.com/
//Login with negative credentilas by Data Provider.
//Then assert that ''Invalid credentials'’ is displayed.
public class C01DataProviders extends TestBase {
    By username = By.xpath("//input[@placeholder=\"Nom d'utilisateur\"]");
    By pass = By.xpath("//input[@placeholder='Mot de passe']");
    By button = By.xpath("//button[@type='submit']");
    @Test(dataProvider = "invalidCredentials")
    public void negativeLoginTest(String userName , String password){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(username).sendKeys(userName);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(button).click();



    }
    @DataProvider(name = "invalidCredentials")
    public Object [][] getData(){
        return new Object[][]{
                {"adm","admin123"},
                {"Admin","admin123"},
                {"Admin","sss"},
                {"ddd","aaa"},};
    }
}
