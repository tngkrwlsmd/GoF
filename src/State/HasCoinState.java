package State;

class HasCoinState implements VendingMachineState {
  @Override
  public void insertCoin() {
      System.out.println("이미 동전이 있습니다.");
  }

  @Override
  public void pressButton() {
      System.out.println("상품이 나옵니다.");
  }

  @Override
  public void dispense() {
      System.out.println("상품을 제공합니다.");
  }
}