package Command;

interface Command {
  void execute();  // 실행 메서드
  void undo();  // 실행 취소 메서드
}