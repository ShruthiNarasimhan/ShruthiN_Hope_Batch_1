package Day_10.Concepts_Code;
class Name{
    private String name;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Name n = new Name();
        n.setName("Shruthi");
        System.out.println(n.getName());
    }
    
}
