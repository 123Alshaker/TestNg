package sda.HomeWorks.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.Utillities.ParameterBrowserTestBase;

import java.util.List;

public class Hw_01 extends ParameterBrowserTestBase {


    @Test
    public void crossBrowserTesting() {
        // Go to URL: https://vziad3.github.io/todo-app/todo-app.html
        driver.get("https://vziad3.github.io/todo-app/todo-app.html");

        // Perform the test steps

        // Checking Box todo-4 and Checking Box todo-5
        checkTodoItem("todo-4");
        checkTodoItem("todo-5");

        // If both clicks worked, then the following List should have a length of 2.
        List<WebElement> done = driver.findElements(By.cssSelector(".done-true"));

        // Assert that this is correct
        Assert.assertEquals(done.size(), 2, "The completed Num Of todos is not Match.");

        // Add a new todo item
        addTodoItem("Do Home Work");

        // Archiving old todos
        archiveTodos();

        // If our archive link worked, then the following list should have a length of 4.
        List<WebElement> notComplete = driver.findElements(By.cssSelector(".done-false"));
        int totalNotComplete = notComplete.size();

        // Assert that this is true as well
        Assert.assertEquals(totalNotComplete, 4, "The incomplete Num Of todos is not exacted.");
    }

    private void checkTodoItem(String itemName) {
        driver.findElement(By.cssSelector("input[type='checkbox'][name='" + itemName + "']")).click();
    }

    private void addTodoItem(String itemText) {
        WebElement addToDo = driver.findElement(By.id("todotext"));
        addToDo.sendKeys(itemText, Keys.ENTER);
    }

    private void archiveTodos() {
        driver.findElement(By.cssSelector("[ng-click='todoList.archive()']")).click();
    }







}
