package Stratergy;

public class StrategyPatternExample {
  public static void main(String[] args) {
      PaymentContext context = new PaymentContext();

      // 신용카드 결제 선택
      context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
      context.pay(50000);  // 출력: 50000원을 신용카드(1234-5678-9012-3456)로 결제합니다.

      // PayPal 결제 선택
      context.setPaymentStrategy(new PayPalPayment("user@example.com"));
      context.pay(30000);  // 출력: 30000원을 PayPal(user@example.com)로 결제합니다.
  }
}