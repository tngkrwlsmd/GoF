package State;

class NoCoinState implements VendingMachineState {
  @Override
  public void insertCoin() {
      System.out.println("동전을 넣었습니다.");
  }

  @Override
  public void pressButton() {
      System.out.println("동전을 넣어야 합니다.");
  }

  @Override
  public void dispense() {
      System.out.println("동전이 없습니다.");
  }
}