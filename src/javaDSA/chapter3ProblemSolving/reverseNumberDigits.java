package javaDSA.chapter3ProblemSolving;
import java.util.Scanner;

public class reverseNumberDigits {
    public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);
    int number = sc.nextInt();
    while(number>0){
        int remainder = number%10;
        int quotient = number/10;
        number = quotient;
        System.out.println(remainder);
    }
    }
}
