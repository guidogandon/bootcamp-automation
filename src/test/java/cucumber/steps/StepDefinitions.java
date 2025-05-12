package cucumber.steps;

import io.cucumber.java.en.*;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {
    Integer total;

    @Given("an example scenario")
    public void an_example_scenario() {
        total = 0;
        System.out.println("Hola");
    }

    @When("all step definitions are implemented")
    public void all_step_definitions_are_implemented() {
        System.out.println("Hola");
        total = total + 1;
    }

    @Then("the scenario passes")
    public void the_scenario_passes() {
        System.out.println(total);
    }

}
