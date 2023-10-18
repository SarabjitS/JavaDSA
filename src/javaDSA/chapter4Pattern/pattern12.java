package javaDSA.chapter4Pattern;
import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int digit1 = 0;
    int digit2 = 1;
    for (int i = 1; i <= num; i++) {
        for(int j = 1; j <= i; j++){
            System.out.print(digit1 + "\t");
            int sum = digit1 + digit2;
            digit1 = digit2;
            digit2 =sum;
        }
        System.out.println();
    }

    }
}
