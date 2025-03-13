package Visitor;

class Cat implements Animal {
  @Override
  public void accept(AnimalVisitor visitor) {
      visitor.visit(this);
  }

  public void meow() {
      System.out.println("야옹!");
  }
}