import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;



public class practiceElementsMyself {
    WebDriver driver;


    @Test
    public void test0111() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\artan\\IdeaProjects\\septTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");


       openBrowser();
       navigateToMainPage();
       addButton();
        //typeQuory();
        //submitSearch();
        //assertResultsPage();
        //waitForResultsElement();

    }

    private void addButton() {
        String selector = ".example > button:nth-child(1)";
        driver.findElement(By.cssSelector(selector)).click();
    }

    private void navigateToMainPage() {
        String url = "https://the-internet.herokuapp.com/add_remove_elements/";
        driver.get(url);
    }

    private void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}