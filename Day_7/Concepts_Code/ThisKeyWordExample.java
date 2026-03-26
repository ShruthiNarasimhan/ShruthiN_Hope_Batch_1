package Day_7.Concepts_Code;

class Student {
    String name;
    String rollno;

    Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;

    }
     void display() {
            System.out.println("Name: " + this.name);
            System.out.println("Roll No: " + this.rollno);
        }

}
class ThisKeyWordExample {
    public static void main(String[] args) {
        Student s1=new Student("Shruthi", "24cs413");
        s1.display();
        System.out.println(s1.hashCode());
        Student s2=new Student("SibiSudhan", "24cs381");
        s2.display();
        System.out.println(s2.hashCode());
        Student s3=new Student("Sruthika", "24cs297");
        s3.display();
        System.out.println(s3.hashCode());
        Student s4=new Student("SivaAdithyaNarayana", "24cs111");
        s4.display();
        System.out.println(s4.hashCode());
    }
}
