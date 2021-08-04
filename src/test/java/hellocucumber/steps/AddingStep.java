package hellocucumber.steps;

import hellocucumber.DummyCalculator;
import hellocucumber.TestContext;
import io.cucumber.java.en.When;



public class AddingStep {
    TestContext testContext;

    public AddingStep(TestContext context) {
        this.testContext = context;
    }

    @When("I add {string} and {string}")
    public void i_add_and(String string, String string2) {
        testContext.setActualResult(DummyCalculator.calculate(string, string2));
    }

}
