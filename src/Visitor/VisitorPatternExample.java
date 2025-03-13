package Visitor;

public class VisitorPatternExample {
  public static void main(String[] args) {
      Animal dog = new Dog();
      Animal cat = new Cat();

      AnimalVisitor soundVisitor = new AnimalSoundVisitor();

      dog.accept(soundVisitor);  // 멍멍!
      cat.accept(soundVisitor);  // 야옹!
  }
}