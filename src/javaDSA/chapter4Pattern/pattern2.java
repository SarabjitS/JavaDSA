package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int nstr = 0;
        int nsp = rows/2+1;

        for(int k = 0; k<rows; k++){
        while(nsp<=0){
            System.out.print(" ");
        }
        for( int j = 0; j< (2*nstr + 1); j++){
            System.out.print("*");
        }
        System.out.println();
            nstr++;
            nsp--;


        }
}
}

