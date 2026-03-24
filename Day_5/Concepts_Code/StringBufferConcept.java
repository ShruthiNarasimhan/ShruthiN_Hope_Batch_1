package Day_5.Concepts_Code;
public class StringBufferConcept {
     public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb);
        System.out.println(sb.toString());
        sb.append(" World");
        System.out.println(sb);
    }
}