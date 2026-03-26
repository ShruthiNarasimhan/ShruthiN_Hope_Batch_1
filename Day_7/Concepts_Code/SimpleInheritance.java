package Day_7.Concepts_Code;
class Parent{
        void display(){
            System.out.println("This is a parent class");
        }
    }
    class Child extends Parent{
        void display1(){
            System.out.println("This is a child class");
        }
    }
public class SimpleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.display1();
        child.display();
    }
}
//Simple Inheritance is a type of inheritance in which a child class inherits from a single parent class. In this example, the Child class is the child class that inherits from the Parent class. The Child class can use the display() method defined in the Parent class, as well as its own display1() method.