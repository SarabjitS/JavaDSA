package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nsp=0;
        int nstr = num;
        for(int i = 0; i<num; i++){
            for(int k=0; k<nsp; k++){
                System.out.print(" \t");
            }
            for(int j = 0; j<nstr; j++){
                System.out.print("*\t");
            }
            System.out.println();
            nstr--;
            nsp++;
        }
    }
}
