package ChainOfResponsibility;

class Manager extends Handler {
  @Override
  public void handleRequest(int level) {
      if (level <= 2) {
          System.out.println("👨‍💼 부장이 요청을 처리합니다.");
      } else if (nextHandler != null) {
          nextHandler.handleRequest(level);
      }
  }
}