package TemplateMethod;

public class TemplateMethodExample {
  public static void main(String[] args) {
      System.out.println("☕ 커피 준비 중...");
      Beverage coffee = new Coffee();
      coffee.prepareRecipe();
      
      System.out.println("\n🍵 차 준비 중...");
      Beverage tea = new Tea();
      tea.prepareRecipe();
  }
}