package Command;

public class CommandPatternExample {
  public static void main(String[] args) {
      Light light = new Light();  // 수신자 객체 (전등)
      RemoteControl remote = new RemoteControl();  // 호출자 (리모컨)

      Command lightOn = new LightOnCommand(light);
      Command lightOff = new LightOffCommand(light);

      // 전등 켜기
      remote.setCommand(lightOn);
      remote.pressButton();  // 💡 전등이 켜졌습니다!

      // 실행 취소 (전등 끄기)
      remote.pressUndo();  // 🔦 전등이 꺼졌습니다!

      // 전등 끄기
      remote.setCommand(lightOff);
      remote.pressButton();  // 🔦 전등이 꺼졌습니다!

      // 실행 취소 (전등 켜기)
      remote.pressUndo();  // 💡 전등이 켜졌습니다!
  }
}