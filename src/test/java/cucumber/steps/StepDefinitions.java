package cucumber.steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {
    Integer total;
    WebDriver driver;


    @Given("the user has {int} liters of water")
    public void given_water(int liters) {
        total = liters;
    }

    @When("the user drinks {int} liters")
    public void user_drinks_water(int waterDrank) {
        total = total - waterDrank;
    }

    @Then("the user should have {int} liters left")
    public void should_have_liters(int litersLeft) {
        System.out.println(total);
        assertThat(total).isEqualTo(litersLeft);
    }

    @Given("the user enter valid credentials")
    public void the_user_enter_valid_credentials() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Buscar los elementos?
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

    }
    @When("the user clicks log in")
    public void the_user_clicks_log_in() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("the inventory should be visible")
    public void the_inventory_should_be_visible() {
        String inventoryUrl = "https://www.saucedemo.com/inventory.html";
        assertThat(driver.getCurrentUrl()).isEqualTo(inventoryUrl);
        List<WebElement> foundLogo = driver.findElements(By.className("app_logo"));
        assertThat(foundLogo.size()).isEqualTo(1);
        driver.quit();
    }
}
