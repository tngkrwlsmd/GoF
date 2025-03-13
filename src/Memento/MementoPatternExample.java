package Memento;

public class MementoPatternExample {
  public static void main(String[] args) {
      TextEditor editor = new TextEditor();
      History history = new History();

      editor.type("Hello, ");
      history.save(editor);  // 첫 번째 상태 저장

      editor.type("World!");
      history.save(editor);  // 두 번째 상태 저장

      System.out.println("현재 텍스트: " + editor.getText()); // Hello, World!

      history.undo(editor);  // 실행 취소 (마지막 저장 상태로 복원)
      System.out.println("Undo 후 텍스트: " + editor.getText()); // Hello, 

      history.undo(editor);  // 한 번 더 실행 취소
      System.out.println("Undo 후 텍스트: " + editor.getText()); // (빈 문자열)
  }
}