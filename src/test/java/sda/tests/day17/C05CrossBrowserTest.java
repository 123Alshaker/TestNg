package sda.tests.day17;

import org.testng.annotations.Test;
import sda.Utillities.ParameterBrowserTestBase;
import sda.Utillities.TestBase;

public class C05CrossBrowserTest extends ParameterBrowserTestBase {


    @Test
    public void test1(){driver.get("https://www.clarusway.com./");}

    @Test
    public void test2(){driver.get("https://www.ebay.com/");}

    @Test
    public void test3(){driver.get("https://www.linkedin.com/");}

    @Test
    public void test4(){driver.get("https://www.clarusway.com./");}

}
