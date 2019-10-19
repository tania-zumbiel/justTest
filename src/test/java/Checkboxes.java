import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class Checkboxes {
    WebDriver driver;
    String resultsStatsID = "resultStats";

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\artan\\IdeaProjects\\septTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void test0112() {
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);

        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
        int numberOfInputs = listOfInputs.size();

        Assert.assertTrue(numberOfInputs ==2);

        WebElement input1 = listOfInputs.get(0);
        WebElement input2 = listOfInputs.get(1);

        boolean isInputDisplayed = input1.isDisplayed();

        Assert.assertTrue(isInputDisplayed);

        String input1CheckedValue = input1.getAttribute("checked");

        if(input1CheckedValue == null){
            input1.click();
        }

        input1CheckedValue = input1.getAttribute("checked");
        Assert.assertEquals(input1CheckedValue, "true");
    }


    @AfterSuite
    public void afterSuite(){

    }

}
