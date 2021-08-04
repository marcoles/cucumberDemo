package hellocucumber.steps;

import hellocucumber.TestContext;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ResultVerificationStep {
    TestContext testContext;

    public ResultVerificationStep(TestContext context) {
        this.testContext = context;
    }

    @Then("the result is {string}")
    public void the_result_is(String string) {
        Assert.assertEquals(testContext.getActualResult(), string, "Result is incorrect");
    }
}
