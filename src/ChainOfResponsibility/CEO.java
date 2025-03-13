package ChainOfResponsibility;

class CEO extends Handler {
  @Override
  public void handleRequest(int level) {
      System.out.println("👑 사장이 요청을 처리합니다.");
  }
}