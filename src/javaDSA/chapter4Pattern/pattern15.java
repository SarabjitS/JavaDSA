package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int nstr = 1;
        int nsp = number/2;
        int digit =1;
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }
            int idigit = digit;
            for(int k = 1; k <= nstr; k++) {
                System.out.print(idigit + "\t");
                    if (k <= nstr/2) {
                        idigit++;
                    } else {
                        idigit--;

                }
            }
                if (i <= number / 2) {
                    nsp--;
                    nstr = nstr + 2;
                    digit++;
                } else {
                    nstr = nstr - 2;
                    nsp++;
                    digit--;
                }
            System.out.println();
        }
    }
}
