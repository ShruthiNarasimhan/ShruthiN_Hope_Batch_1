package Day_10.Concepts_Code;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        try{
             int arr[]={1,2,3,4,5};
             System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
