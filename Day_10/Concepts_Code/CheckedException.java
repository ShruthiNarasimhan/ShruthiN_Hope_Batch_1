package Day_10.Concepts_Code;

import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("Hope-B1.txt");
            System.out.println(f);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
