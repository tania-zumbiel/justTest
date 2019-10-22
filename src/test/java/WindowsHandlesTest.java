import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WindowsHandlesTest {


    WebDriver driver;
    String resultsStatsID = "resultStats";

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\artan\\IdeaProjects\\septTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void test0222() {
        String url = "https://the-internet.herokuapp.com/windows";
        driver.get(url);
    }

    @AfterSuite
    public void afterSuite(){

    }
}
