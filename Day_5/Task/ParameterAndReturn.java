package Day_5.Task;

public class ParameterAndReturn{

    public static int add(int a,int b){
        System.out.println("Adding two numbers (with params & return)");
        return a+b;
    }

    public static int getSum(){
        int x=10;
        int y=20;
        System.out.println("Adding inside method (no params, but return)");
        return x+y;
    }

    public void printSum(int a,int b){
        System.out.println("Printing sum (with params, no return)");
        int res=a+b;
        System.out.println("Sum is:"+res);
    }

    public void display(){
        int x=5;
        int y=5;
        System.out.println("No params, no return example");
        System.out.println("Sum is:"+(x+y));
    }

    public static void main(String[] args){

        int num1=5;
        int num2=10;

        ParameterAndReturn obj=new ParameterAndReturn();

        int result1=add(num1,num2);
        System.out.println("Result1="+result1);

        int result2=getSum();
        System.out.println("Result2="+result2);

        obj.printSum(num1,num2);
        obj.display();
    }
}