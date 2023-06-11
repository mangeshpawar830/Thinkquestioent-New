package com.Oops.AbstractInterface;

abstract class AbstractClass {
  int a;

 public AbstractClass(int number) {
     this.a = number;
 }

 public abstract void abstractMethod();
}

//Interface
interface MyInterface {
 int b = 5;

 void interfaceMethod();
}

//Child Class
class ChildClass extends AbstractClass implements MyInterface {
 public ChildClass(int number) {
     super(number);
 }

 
 public void abstractMethod() {
     System.out.println("Abstract Method Implementation: " + (a + b));
 }

 
 public void interfaceMethod() {
     System.out.println("Interface Method Implementation: " + (a + b));
 }
}

public class AbstractAddition {
 public static void main(String[] args) {
     ChildClass child = new ChildClass(10);
     child.abstractMethod();
     child.interfaceMethod();
 }
}
