package driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebDriverManager {
    private static WebDriver driver;

    @Before
    public void setUp() {
        if (driver == null) {
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            ChromeOptions options = new ChromeOptions();
            // Opsiyonel: WebDriver'ı headless moda geçirme
            // options.addArguments("--headless");

            driver = new ChromeDriver(options);
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
