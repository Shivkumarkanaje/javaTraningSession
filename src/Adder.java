import java.util.Scanner;

public class Adder {

    private int input1 = 0;
    private int input2 = 0;
    private Scanner scanner =new Scanner(System.in);

    public void takeFirstInputFromTheUser(){
        System.out.println("Enter First input");
        input1 = scanner.nextInt();
    }
    public void takeSecondInputFromTheUser(){
        System.out.println("Enter Second input");
        input2 = scanner.nextInt();
    }

    public void sumAndPrintResult(){
        System.out.println("Sum is : "+performSum(input1, input2));
    }

    private int performSum(int i1, int i2){
        int sum = input1 + input2;
        return sum;
    }
}
