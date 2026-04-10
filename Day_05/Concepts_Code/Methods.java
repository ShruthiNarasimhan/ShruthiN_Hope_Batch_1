package Day_05.Concepts_Code;
public class Methods {
   public static void main(String[] args) {
        Methods m=new Methods();
        String s="Hello";
        System.out.println(s);
        m.square(2);
    }
    public void square(int n){
        int value=n*n;
        System.out.print(value*n*n);
    }
}