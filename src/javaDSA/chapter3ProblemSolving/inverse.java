package javaDSA.chapter3ProblemSolving;
import java.util.Scanner;
public class inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int position = 1;
        int inverse= 0;
        while(number>0){
            int remainder = number%10;
            int quotient = number/10;
            inverse = inverse + position*(int)Math.pow(10, remainder-1);
            number = quotient;
            position++;
        }
        System.out.println(inverse);
    }
}
