package Stratergy;

class PaymentContext {
  private PaymentStrategy strategy;

  public void setPaymentStrategy(PaymentStrategy strategy) {
      this.strategy = strategy;
  }

  public void pay(int amount) {
      if (strategy == null) {
          System.out.println("결제 방법이 선택되지 않았습니다.");
      } else {
          strategy.pay(amount);
      }
  }
}