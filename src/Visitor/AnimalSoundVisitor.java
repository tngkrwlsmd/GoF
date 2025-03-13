package Visitor;

class AnimalSoundVisitor implements AnimalVisitor {
  @Override
  public void visit(Dog dog) {
      dog.bark();
  }

  @Override
  public void visit(Cat cat) {
      cat.meow();
  }
}