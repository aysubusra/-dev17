package pages;


import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
    private static WebDriver driver;

    // Constructor
    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }


    // Element Locators
    private static final By buttonsElementLocator = By.xpath("//span[text()='Buttons']");
    private static final By clickMeButtonLocator = By.xpath("//button[text()='Click Me']");
    //private final By messageLocator = By.id("dynamicClickMessage");



    // Methods to interact with the elements
    public static void clickButtonsElement() {
        driver = WebDriverManager.getDriver();
        driver.findElement(buttonsElementLocator).click();
    }

    public static void clickClickMeButton() {
        driver.findElement(clickMeButtonLocator).click();
    }
}


