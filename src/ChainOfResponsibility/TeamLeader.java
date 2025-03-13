package ChainOfResponsibility;

class TeamLeader extends Handler {
  @Override
  public void handleRequest(int level) {
      if (level <= 1) {
          System.out.println("🧑‍💼 팀장이 요청을 처리합니다.");
      } else if (nextHandler != null) {
          nextHandler.handleRequest(level);
      }
  }
}