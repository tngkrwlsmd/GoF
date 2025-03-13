package Memento;

import java.util.Stack;

class History {
  private Stack<TextMemento> history = new Stack<>();

  public void save(TextEditor editor) {
      history.push(editor.save());  // 현재 상태 저장
  }

  public void undo(TextEditor editor) {
      if (!history.isEmpty()) {
          editor.restore(history.pop());  // 이전 상태로 복원
      }
  }
}