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
//Inheritance is a fundamental object-oriented programming concept that allows a new class (called a child or subclass) to inherit properties and behaviors (fields and methods) from an existing class (called a parent or superclass). In this example, the Dog class is the child class that inherits from the Animal class, which is the parent class. The Dog class can use the display() method defined in the Animal class, as well as its own bark() method.