package Stratergy;

class CreditCardPayment implements PaymentStrategy {
  private String cardNumber;

  public CreditCardPayment(String cardNumber) {
      this.cardNumber = cardNumber;
  }

  @Override
  public void pay(int amount) {
      System.out.println(amount + "원을 신용카드(" + cardNumber + ")로 결제합니다.");
  }
}