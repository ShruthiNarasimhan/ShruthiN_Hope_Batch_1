package Day_7.Concepts_Code;

class Animal {
    void display() {
        System.out.println("There are multiple animals choose 1 and mention its sound.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog sound=new Dog();
        sound.bark();
        System.out.println(sound.hashCode());        
    }
    
}
