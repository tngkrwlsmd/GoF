package Command;

class RemoteControl {
  private Command command;  // 저장된 명령

  public void setCommand(Command command) {
      this.command = command;
  }

  public void pressButton() {
      command.execute();  // 명령 실행
  }

  public void pressUndo() {
      command.undo();  // 실행 취소
  }
}