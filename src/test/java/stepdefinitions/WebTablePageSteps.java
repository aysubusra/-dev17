package stepdefinitions;

import driver.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.WebTablePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class WebTablePageSteps {
    private WebDriver driver;

    public void WebTablePage() {
        this.driver = WebDriverManager.getDriver();
    }


    @Given("User navigates to the web table page")
    public void navigateToWebTablesPage() {
        this.driver = WebDriverManager.getDriver();
        driver.get("https://demoqa.com/webtables");
    }


    @When("User clicks on the ADD button")
    public void clickAddButton() {
        WebTablePage.clickAddButton();
    }

    @When("User adds a new record")
    public void addNewRecord() {
        WebTablePage.addNewRecord("John", "Doe", "john.doe@example.com", "30", "50000", "IT");
    }

    @When("User edits the added record")
    public void editAddedRecord() {
        WebTablePage.editRecord();
    }

    @Then("User verifies the edited record")
    public void verifyEditedRecord() {
        WebElement element = driver.findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div:nth-child(4) > div > div:nth-child(1)"));
        String newName = element.getText();
        assertEquals("Jane", newName);
    }
}


