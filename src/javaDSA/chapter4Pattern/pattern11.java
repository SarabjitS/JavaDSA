package javaDSA.chapter4Pattern;
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(digit + "\t");
                digit++;
            }
            System.out.println();

        }
    }
}
