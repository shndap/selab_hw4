package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class MyStepdefs {

    int a;
    int b;
    String opt;
    int result;

    Calculator calculator = new Calculator();

    @Given("Two input values, {int} and {int}, and an operator {string}")
    public void two_input_values(int x, int y, String o) {
        a = x;
        b = y;
        opt = o;
    }

    @When("I apply the operator on the two values")
    public void i_apply_the_operator_on_the_two_values() {
        result = calculator.calculate(a, b, opt);
    }

    @Then("I expect the result {int}")
    public void i_expect_the_result(int expected) {
        assertEquals(expected, result);
    }
}
