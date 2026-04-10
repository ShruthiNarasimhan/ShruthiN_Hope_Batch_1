
package Day_05.Concepts_Code;
public class StringBuilderConcept {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.toString());
        sb.append(" World");
        System.out.println(sb);
        
    }
}