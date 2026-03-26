package Day_7.Concepts_Code;
class Subjects {
    void display() {
        System.out.println("There are multiple Works to do in a Subject ");
    }
}
class Maths extends Subjects {
    void Exam() {
        System.out.println("Write Maths exam");
    }
}
class Solve extends Maths {
    void Write() {
        System.out.println("Solve the problems");
    }
}
class FindX extends Solve {
    void Problem() {
        System.out.println("Find X is the problem");
    }
}
public class MultiLevelInheritance{
   public static void main(String[] args) {
        FindX x = new FindX();
        x.Problem();
        x.Write();
        x.Exam();
        x.display();
}
}
//Multi-Level Inheritance is a type of inheritance in which a class is derived from another class, which is also derived from another class. In this example, the Subjects class is the parent class, the Maths class is the child class that inherits from Subjects, the Solve class is the child class that inherits from Maths, and the FindX class is the child class that inherits from Solve. Each child class can use the methods defined in its parent classes, as well as its own methods.