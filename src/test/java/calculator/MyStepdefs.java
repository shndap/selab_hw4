package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class MyStepdefs {

    int a;
    int b;
    int result;

    @Given("Two input values, {int} and {int}")
    public void two_input_values(int x, int y) {
        a = x;
        b = y;
    }

    @When("I add the two values")
    public void i_add_the_two_values() {
        result = a + b;
    }

    @Then("I expect the result {int}")
    public void i_expect_the_result(int expected) {
        assertEquals(expected, result);
    }
}