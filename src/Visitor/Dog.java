package Visitor;

class Dog implements Animal {
  @Override
  public void accept(AnimalVisitor visitor) {
      visitor.visit(this);
  }

  public void bark() {
      System.out.println("멍멍!");
  }
}