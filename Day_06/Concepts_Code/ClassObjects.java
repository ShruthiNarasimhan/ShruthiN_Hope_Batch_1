package Day_06.Concepts_Code;

public class ClassObjects {
    public static void main(String[] args) {
        System.out.println("This is a class and object concept in java");  
        SimpleApartment ap = new SimpleApartment();
        ap.display();
    }     
}
class SimpleApartment{
    public void display(){
        System.out.println("Im Inside the apartment class");
    }
}
