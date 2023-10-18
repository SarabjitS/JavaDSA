package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int nsp = 0;
        for(int i = 1; i<= number; i++){
            for(int j =1; j<= nsp; j++) {
                System.out.print(" \t");
            }
            System.out.println("*");
            nsp++;
            }
        }
    }

