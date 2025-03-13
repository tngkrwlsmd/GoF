package TemplateMethod;

class Coffee extends Beverage {
  @Override
  protected void brew() {
      System.out.println("커피를 내립니다.");
  }

  @Override
  protected void addCondiments() {
      System.out.println("설탕과 우유를 추가합니다.");
  }
}