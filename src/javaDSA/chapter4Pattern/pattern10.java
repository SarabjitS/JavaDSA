package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nsp = num/2;
        int nsp2 = -1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            if(i!=1 && i!=num){
                for(int k =1; k<=nsp2; k++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= num/2){
                nsp2= nsp2+2;
                nsp--;
            }else{
                nsp2= nsp2-2;
                nsp++;
            }
        }
    }
}
