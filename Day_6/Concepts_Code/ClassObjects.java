package Day_6.Concepts_Code;

public class ClassObjects {
    public static void main(String[] args) {
        System.out.println("This is a class and object concept in java");  
        Apartment ap = new Apartment();
        ap.display();
    }

    
    
}
class Apartment{
    public void display(){
        System.out.println("Im Inside the apartment class");
    }
}
