package Observer;

class NewsReader implements Observer {
  private String name;

  public NewsReader(String name) {
      this.name = name;
  }

  @Override
  public void update(String news) {
      System.out.println(name + "님에게 새로운 뉴스 알림: " + news);
  }
}