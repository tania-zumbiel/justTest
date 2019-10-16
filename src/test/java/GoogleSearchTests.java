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

public class GoogleSearchTests {
    WebDriver driver;
    String resultsStatsID = "resultStats";

    

    @AfterSuite
    public void afterSuit(){
        //driver.quit();
    }

    @Test
    public void test0111() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\artan\\IdeaProjects\\septTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");


        openBrowser();
        navigateToMainPage();
        typeQuory();
        submitSearch();
        assertResultsPage();
        waitForResultsElement();
    }

    private void waitForResultsElement() {
        By elementToWait = (By.id(resultsStatsID));
        ExpectedCondition condition = ExpectedConditions.presenceOfElementLocated(elementToWait);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(condition);


    }


    private void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    private void navigateToMainPage() {
        String url = "https://www.google.com";
        driver.get(url);
    }

    private void typeQuory() {
        String selector = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        WebElement webElement = driver.findElement(By.cssSelector(selector));
        webElement.sendKeys("AtUrPlace Fitness");

    }

    private void submitSearch() {
        String selector = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        driver.findElement(By.cssSelector(selector)).submit();
    }

    private void assertResultsPage() {

        WebElement resultStatsElement = driver.findElement(By.id(resultsStatsID));
        boolean isDisplayed = resultStatsElement.isDisplayed();
        boolean expected = true;
        //Assert.assertEquals(isDisplayed, expected);
    }



}
