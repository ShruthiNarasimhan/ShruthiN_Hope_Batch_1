package Day_10.Concepts_Code;
abstract class ABC{
    abstract void display();
    void abc()
    {
        System.out.println("Hello");
    }
}
class BCD extends ABC{
    void display()
    {
        System.out.println("This is the implementation of abstract method");
    }
    void abc()
    {
        System.out.println("Hi");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        BCD obj = new BCD();
        obj.abc();
    }
}
