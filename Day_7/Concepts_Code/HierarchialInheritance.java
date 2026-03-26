package Day_7.Concepts_Code;
class Father {
    void display() {
        System.out.println("Hi,This is Grand Father here and I am Having a Son and a Daughter");
    }
}
class Son extends Father {
    void job() {
        System.out.println("Since you are going to Job, I am Going to Hand over the Business to your Sister!");
    }
}
class Daughter extends Father {
    void business() {
        System.out.println("Hurray! I got a Business and I am going to run it successfully with the help of my Father and Brother");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Son s=new Son();
        s.display();
        s.job();
        Daughter d=new Daughter();
        d.display();
        d.business();
    }
    
}
