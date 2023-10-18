package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int nstar = num/2 +1;
        int nsp = 1;
        for(int i = 1; i<=num; i++){
            for(int j =1; j <= nstar; j++){
                System.out.print("*\t");
            }
            for(int k=1; k<= nsp; k++){
                System.out.print("\t");
            }
            for(int l =1; l<=nstar; l++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= num/2){
                nsp = nsp+2;
                nstar--;
            }else{
                nstar++;
                nsp =nsp-2;
            }
        }

    }
}
