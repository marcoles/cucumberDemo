Feature: Calculator
  Operations return correct answers

  Scenario Outline: Adding two numbers returns correct result
    When I add <number1> and <number2>
    Then the result is <result>
    Examples:
      |number1  |number2 |result |
      |'1'      |'2'     |'3'    |
      |'0'      |'2'     |'2'    |
      |'1'      |'-2'    |'-1'   |
      |'-1'     |'-2'    |'-3'   |
      |'3000'   |'2000'  |'5000' |



