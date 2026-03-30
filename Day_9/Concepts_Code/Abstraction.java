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