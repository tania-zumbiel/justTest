import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest {
    WebDriver driver;

    @Test
    public void test0111() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\artan\\IdeaProjects\\septTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");

        openBrowser();
        navigateToTestPage();
        findElementById();

    }

    private void findElementById() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        String selector = "html.no-js body div.row div#content.large-12.columns div.example form#login button.radius i.fa.fa-2x.fa-sign-in";
        driver.findElement(By.cssSelector(selector)).click();
    }


    private void navigateToTestPage() {
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
    }

    private void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
