@tag
Feature: Calculator

    Scenario Outline: add two numbers
        Given Two input values, <first> and <second>, and an operator "<opt>"
        When I apply the operator on the two values
        Then I expect the result <result>
        Examples:
            | first | second | opt | result |
            | 6     | 2      | *   | 12     |
            | 6     | 2      | /   | 3      |
            | 6     | 2      | +   | 8      |
            | 6     | 2      | -   | 4      |
            | 2     | 3      | ^   | 8      |

