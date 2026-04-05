public class AutoBoxing {
    public static void main(String[] args) {
        int a=10;
        Integer objA=a;
        System.out.println(objA);
        Integer b=-128;
        Integer objB=-128;
        System.out.println(b == objB);
    }
}
