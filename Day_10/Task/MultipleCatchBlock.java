package Day_10.Task;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int arr[]={1,2,3,4,5};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//The Parent Class Exception cannot be placed before the Child Class ArrayIndexOutOfBoundsException because it will give an error as the Parent Class will catch all the exceptions and the Child Class will never be reached.