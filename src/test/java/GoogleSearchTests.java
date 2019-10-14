import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSearchTests {
    WebDriver driver;

    @Test
    public void test0111(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\artan\\IdeaProjects\\septTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");

        
        openBrowser();
        navigateToMainPage();
        typeQuory();
    }

    private void openBrowser(){
        driver = new FirefoxDriver();
    }

    private void navigateToMainPage() {
        String url = "https://www.google.com";
        driver.get(url);
    }

    private void typeQuory() {
        String selector = ".gLFyf";
        WebElement webElement = driver.findElement(By.cssSelector(selector));
        WebElement.send
    }

}
