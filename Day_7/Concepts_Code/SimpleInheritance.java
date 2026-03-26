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
