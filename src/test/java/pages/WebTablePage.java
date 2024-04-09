package pages;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablePage {
    private static WebDriver driver;

    // Constructor
    public WebTablePage(WebDriver driver) {
        this.driver = driver;
    }

    // Element Locators
    private static final By addButtonLocator = By.id("addNewRecordButton");
    private static final By firstNameFieldLocator = By.id("firstName");
    private static final By lastNameFieldLocator = By.id("lastName");
    private static final By emailFieldLocator = By.id("userEmail");
    private static final By ageFieldLocator = By.id("age");
    private static final By salaryFieldLocator = By.id("salary");
    private static final By departmentFieldLocator = By.id("department");
    private static final By submitButtonLocator = By.id("submit");

    // Methods to interact with the elements
    public static void clickAddButton() {
        driver = WebDriverManager.getDriver();
        driver.findElement(addButtonLocator).click();
    }

    public static void addNewRecord(String firstName, String lastName, String email, String age, String salary, String department) {
        driver.findElement(firstNameFieldLocator).sendKeys(firstName);
        driver.findElement(lastNameFieldLocator).sendKeys(lastName);
        driver.findElement(emailFieldLocator).sendKeys(email);
        driver.findElement(ageFieldLocator).sendKeys(age);
        driver.findElement(salaryFieldLocator).sendKeys(salary);
        driver.findElement(departmentFieldLocator).sendKeys(department);
        driver.findElement(submitButtonLocator).click();
    }

    public static void editRecord() {
        WebElement editButton = driver.findElement(new By.ByCssSelector("#edit-record-1"));
        editButton.click();
        WebElement nameField = driver.findElement(new By.ByCssSelector("#firstName"));
        nameField.clear();
        nameField.sendKeys("Jane");
        WebElement submitButton = driver.findElement(new By.ById("submit"));
        submitButton.click();

    }
}

