package Day_07.Concepts_Code;

public class SuperKeyword{
    public static void main(String[] args){
superExample2 s2 = new superExample2();
s2.reject();
    }
}
class superExample1{
    superExample1(){
        System.out.println("called in super example1");
    }
    void display(){
        System.out.println("welcome to my home");
    }
}
class superExample2 extends superExample1{
    superExample2(){
        System.out.println("called in super example2");
    }
    void reject(){
        System.out.println("i havent called you");
        super.display();
    }
}
//The super keyword in Java is used to refer to the immediate parent class of a class. It can be used to access methods and constructors of the parent class. In this example, the superExample2 class extends the superExample1 class, and the reject() method in superExample2 uses super.display() to call the display() method defined in the superExample1 class.
