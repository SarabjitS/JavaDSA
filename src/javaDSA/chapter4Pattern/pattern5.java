package javaDSA.chapter4Pattern;
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int nsp = num/2;
    int nstr = 1;
    for(int i = 1; i<= num; i++){
        for(int j = 1 ; j<=nsp ; j++){
            System.out.print(" \t");
        }
        for(int k =1; k<=nstr; k++){
            System.out.print("*\t");
        }
        if(i <=num/2) {
            nstr = nstr + 2;
            nsp--;
        }else {

            nsp++;
            nstr = nstr - 2;
        }
        System.out.println();

    }
}
}