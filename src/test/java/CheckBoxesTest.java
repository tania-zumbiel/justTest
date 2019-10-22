import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CheckBoxesTest {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\artan\\IdeaProjects\\septTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testCheckBoxes(){

        openBrowser();
        navigateToMainPage();
        getNumberOfInputs();

    }

    private void getNumberOfInputs() {
        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
        int numberOfInputs = listOfInputs.size();
        Assert.assertTrue(numberOfInputs ==2);
    }

    private void navigateToMainPage() {
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);
    }

    private void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterSuite
    public void afterSuit(){
        //driver.quit();
    }


}
