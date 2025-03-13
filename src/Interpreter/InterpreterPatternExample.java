package Interpreter;

import java.util.Map;

public class InterpreterPatternExample {
  public static void main(String[] args) {
      // (1 + 2) - 3 해석
      Expression expr = new SubtractExpression(
          new AddExpression(new NumberExpression(1), new NumberExpression(2)),
          new NumberExpression(3)
      );

      // 해석 및 결과 출력
      int result = expr.interpret(Map.of());
      System.out.println("결과: " + result);  // 결과: 0
  }
}