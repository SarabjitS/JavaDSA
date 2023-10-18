package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int nsp = number-1;
        int nstr = 1;
        for(int i = 0; i<number; i++){
            for(int j = nsp; j>0; j--){
                System.out.print(" \t");
            }
            for(int k = 0; k<nstr; k++){
                System.out.print("*\t");
            }
            System.out.println();
            nsp--;
            nstr++;
        }
    }
}
