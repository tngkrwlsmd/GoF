package Memento;

class TextEditor {
  private String text = "";

  public void type(String newText) {
      text += newText;  // 기존 텍스트에 새 텍스트 추가
  }

  public String getText() {
      return text;
  }

  public TextMemento save() {
      return new TextMemento(text);  // 현재 상태 저장
  }

  public void restore(TextMemento memento) {
      text = memento.getText();  // 저장된 상태로 복원
  }
}