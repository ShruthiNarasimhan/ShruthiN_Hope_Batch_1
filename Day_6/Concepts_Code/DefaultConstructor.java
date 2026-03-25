package Day_6.Concepts_Code;
 class dconstructor{
    public dconstructor(int x){
        System.out.println("This is a default constructor:"+x);
    }
    int x=10;
}

public class DefaultConstructor { 
    public static void main(String[] args) {
        dconstructor dc = new dconstructor(10);
        System.out.println(dc);
    System.out.println("Im inside the main method");
    System.out.println(dc.x);
}
}