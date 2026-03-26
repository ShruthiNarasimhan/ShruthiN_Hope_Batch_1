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
