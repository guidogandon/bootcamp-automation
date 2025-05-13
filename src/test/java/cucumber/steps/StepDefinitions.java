package cucumber.steps;


import io.cucumber.java.en.*;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {
    Integer total;


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
}
