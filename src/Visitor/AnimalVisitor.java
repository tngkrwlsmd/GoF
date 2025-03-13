package Visitor;

interface AnimalVisitor {
  void visit(Dog dog);
  void visit(Cat cat);
}