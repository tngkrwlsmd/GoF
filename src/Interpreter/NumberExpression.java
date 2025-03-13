package Interpreter;

import java.util.Map;

interface Expression {
  int interpret(Map<String, Integer> context); // 값을 해석하는 메서드
}

class NumberExpression implements Expression {
  private int number;

  public NumberExpression(int number) {
      this.number = number;
  }

  @Override
  public int interpret(Map<String, Integer> context) {
      return number;
  }
}