package TemplateMethod;

abstract class Beverage {
  // Template Method: 음료 만드는 순서를 정의
  public final void prepareRecipe() {
      boilWater();
      brew();
      pourInCup();
      addCondiments();
  }

  // 공통된 메서드 (모든 음료에서 동일하게 사용)
  private void boilWater() {
      System.out.println("물을 끓입니다.");
  }

  private void pourInCup() {
      System.out.println("컵에 따릅니다.");
  }

  // 하위 클래스에서 구현해야 하는 추상 메서드
  protected abstract void brew();          // 우려내기 (커피 or 차)
  protected abstract void addCondiments(); // 첨가물 추가 (설탕, 레몬 등)
}