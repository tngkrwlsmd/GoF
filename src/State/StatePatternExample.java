package State;

public class StatePatternExample {
  public static void main(String[] args) {
      VendingMachine machine = new VendingMachine();

      machine.insertCoin();  // 동전을 넣었습니다.
      machine.pressButton(); // 상품이 나옵니다.
      machine.dispense();    // 상품을 제공합니다.

      machine.insertCoin();  // 동전을 넣었습니다.
      machine.pressButton(); // 상품이 나옵니다.
      machine.dispense();    // 상품을 제공합니다.
  }
}