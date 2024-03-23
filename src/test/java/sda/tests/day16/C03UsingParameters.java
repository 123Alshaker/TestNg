package sda.tests.day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.Utillities.TestBase;

public class C03UsingParameters extends TestBase {

    @Test
    @Parameters("name")
    public void parameterizedTest(String name ){
        System.out.println("Welcom : "+ name);
    }

    @Test
    @Parameters({"name","lastName","age"})
    public void info(String name , String lastName , String age ){
        System.out.println("welcome : " + name + lastName + "whir age : " + age);
    }

}
