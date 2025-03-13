package TemplateMethod;

class Tea extends Beverage {
  @Override
  protected void brew() {
      System.out.println("차를 우려냅니다.");
  }

  @Override
  protected void addCondiments() {
      System.out.println("레몬을 추가합니다.");
  }
}