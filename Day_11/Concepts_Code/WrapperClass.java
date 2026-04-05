
public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        Integer objA=10;
        System.out.println(objA);
        System.out.println(a==objA);
        System.out.println(objA.hashCode());
        Character ch='A';
        System.out.println(ch);
        System.out.println(ch.hashCode());
        
    }
    
}
