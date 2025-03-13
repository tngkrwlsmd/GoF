package State;

class VendingMachine {
  private VendingMachineState state;

  public VendingMachine() {
      this.state = new NoCoinState(); // 초기 상태 설정
  }

  public void setState(VendingMachineState state) {
      this.state = state;
  }

  public void insertCoin() {
      state.insertCoin();
      if (state instanceof NoCoinState) {
          setState(new HasCoinState());
      }
  }

  public void pressButton() {
      state.pressButton();
      if (state instanceof HasCoinState) {
          setState(new NoCoinState());
      }
  }

  public void dispense() {
      state.dispense();
  }
}