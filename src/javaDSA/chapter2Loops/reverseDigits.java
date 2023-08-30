package javaDSA.chapter2Loops;
import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int newNum = 0;
        int tempNum = 0;
        while (num != 0)
        {
           tempNum = num%10;
           newNum = newNum*10 + tempNum;
           num/=10;
        }
        System.out.println(newNum);
        }
    }


