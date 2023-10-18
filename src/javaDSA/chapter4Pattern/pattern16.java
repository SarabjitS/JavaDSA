package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nstr1 = 1;
        int nstr2 = 1;
        int nsp = 2 * num - 3;
        for(int i = 1; i <= num; i++){
            int num1 =1;
            int num2;
            if(i < num){
            num2 = i;
            }else{
                num2 = i -1;
            }
            for(int j =1; j <= nstr1; j++){

                System.out.print(num1 + "\t");
                num1++;
            }
            for(int k = 1; k <= nsp; k++){
                System.out.print("\t");
            }
            for(int l = 1; l <= nstr2; l++){
                System.out.print(num2+ "\t");
                num2--;
            }
            System.out.println();
            if(i != num-1){
                nstr2++;
            }
            nstr1++;
            nsp = nsp -2;
        }
    }
}
