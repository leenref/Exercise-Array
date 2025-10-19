import java.util.Scanner;

public class nn {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Q11");

        System.out.println("input first integer: ");

        int firstNum=scan.nextInt();

        System.out.println("input second integer: ");
        int secondNum=scan.nextInt();

        if(firstNum == secondNum){
            System.out.println(firstNum+ " = "+ secondNum);
        }else{
            System.out.println(firstNum+ " != "+ secondNum);
        }

        if(firstNum > secondNum){
            System.out.println(firstNum+ " > "+ secondNum);
        }else{
            System.out.println(firstNum+ " < "+ secondNum);
        }

        if(firstNum >= secondNum ){
            System.out.println(firstNum+ " >= "+ secondNum);
        }else{
            System.out.println(firstNum+ " <= "+ secondNum);
        }
    }
}
