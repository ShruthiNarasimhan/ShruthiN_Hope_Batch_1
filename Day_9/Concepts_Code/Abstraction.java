package Day_9.Concepts_Code;
abstract class Shape {
    abstract void display();
    void dimention() {
        System.out.println("This is a 2D Shape");
    }
}
class Circle extends Shape {
    void display() {
        System.out.println("Area of Circle is: πr^2");
    }
}
class Radius extends Circle {
    void display() {
        System.out.println("The radius of the circle is 5 units"); 
        super.display();
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape r=new Radius();
        r.dimention();
        r.display();

    }
    
}
//Abstraction is a process of hiding the implementation details and showing only functionality to the user. It helps to reduce complexity and allows the programmer to focus on interactions at a higher level. In Java, abstraction can be achieved using abstract classes and interfaces. An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods (until Java 8, after which it can also have default and static methods).