package stepdefinitions;

import driver.WebDriverManager;
import driver.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ElementsPage;
import pages.WebTablePage;


public class ElementsPageSteps {

    private WebDriver driver = WebDriverManager.getDriver();

    public void ElementsPage() {
        this.driver = WebDriverManager.getDriver();
    }

    @Given("User navigates to the elements page")
    public void navigateToElementsPage() {
        this.driver = WebDriverManager.getDriver();
        driver.get("https://demoqa.com/elements");
    }

    @When("User clicks on the Buttons element")
    public void clickButtonsButton() {
        ElementsPage.clickButtonsElement();
    }

    @And("User clicks on the Click Me button")
    public void clickClickMeButton() {
        ElementsPage.clickClickMeButton();
    }

    @Then("User verifies the displayed message")
    public void verifyMessage() {
        WebElement messageElement = driver.findElement(By.cssSelector("#dynamicClickMessage"));
        String dynamicMessage = messageElement.getText();
        Assert.assertEquals("You have done a dynamic click", dynamicMessage);
    }
}
