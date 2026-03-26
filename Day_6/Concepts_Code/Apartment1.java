package Day_6.Concepts_Code;

public class Apartment1 {
    public static void main(String[] args) {
        System.out.println("This is a class and object concept in java");

        Apartment ap1 = new Apartment();
        ap1.bedrooms=1;
        ap1.display("Scenario 1");

        Apartment ap2 = new Apartment();
        ap2.bedrooms=2;
        ap2.display("Scenario 2");

        Apartment ap3 = new Apartment();
        ap3.bedrooms=4;
        ap3.display("Scenario 3");
    }
}

class Apartment{
    int bedrooms;

    public void display(String name){

        int restrooms=bedrooms;
        int kitchens=1;
        int playgrounds=1;
        int livingRooms=(bedrooms>=4)?2:1;
        int diningHalls=(bedrooms>=2)?1:0;

        System.out.print(name+" has ");

        print(bedrooms,"bedroom");
        print(kitchens,"kitchen");
        print(restrooms,"restroom");
        print(livingRooms,"living room");
        print(diningHalls,"dining hall");
        print(playgrounds,"playground");

        System.out.println(".");
    }

    void print(int c,String word){
        if(c==0) return;
        if(c==1) System.out.print(c+" "+word+", ");
        else System.out.print(c+" "+word+"s, ");
    }
}