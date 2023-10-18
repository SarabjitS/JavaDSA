package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nsp = num -1;
        for(int i = 1; i<=num; i++){
            for(int j =1; j<=nsp; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
            nsp--;
        }
    }
}
