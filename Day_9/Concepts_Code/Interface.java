package Day_9.Concepts_Code;
interface A
{
    void show();
}
interface B
{
    void display();
}
class C implements A,B
{
    public void show()
    {
        System.out.println("This is show method");
    }
    public void display()
    {
        System.out.println("This is display method");
    }
}
public class Interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }

    
} 