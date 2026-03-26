package Day_7.Task;

class Person{
    String name;
    int id;

    Person(String name,int id){
        this.name=name;
        this.id=id;
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
    }
}

class Librarian extends Person{
    String role;

    Librarian(String name,int id,String role){
        super(name,id);
        this.role=role;
    }

    void work(){
        System.out.println(name+" manages library");
    }
}

class Member extends Person{
    int books;

    Member(String name,int id,int books){
        super(name,id);
        this.books=books;
    }

    void borrow(){
        System.out.println(name+" borrowed book");
    }
}

class StudentMember extends Member{
    String course;

    StudentMember(String name,int id,int books,String course){
        super(name,id,books);
        this.course=course;
    }

    void show(){
        display();
        System.out.println("Course:"+course);
        System.out.println("Books:"+books);
    }
}

class Book{
    String title;
    String author;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    void displayBook(){
        System.out.println(title+" by "+author);
    }
}

class IssuedBook extends Book{
    String issuedTo;

    IssuedBook(String title,String author,String issuedTo){
        super(title,author);
        this.issuedTo=issuedTo;
    }

    void details(){
        displayBook();
        System.out.println("Issued to:"+issuedTo);
    }
}

public class LibraryManagement{
    public static void main(String[] args){
        Librarian l=new Librarian("Anita",1,"Head");
        l.display();
        l.work();

        StudentMember s=new StudentMember("Rahul",2,1,"CSE");
        s.show();
        s.borrow();

        IssuedBook b=new IssuedBook("Clean Code","Robert Martin","Rahul");
        b.details();
    }
}