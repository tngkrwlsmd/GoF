package ChainOfResponsibility;

abstract class Handler {
  protected Handler nextHandler; // 다음 처리자

  public void setNextHandler(Handler nextHandler) {
      this.nextHandler = nextHandler;
  }

  public abstract void handleRequest(int level);
}
