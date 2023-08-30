package javaDSA.chapter3ProblemSolving;

import java.util.Scanner;
public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("The "+ firstNumber + "th number in Fibonnaci series is "+firstNumber);
        System.out.println("The "+ secondNumber + "st number in Fibonnaci series is "+secondNumber);
        System.out.print("Enter the number of fibonnaci series ");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 2; i<=number; i++){
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }
        System.out.println("The " + number + "number in series is " + sum);
while ()
    }

}
