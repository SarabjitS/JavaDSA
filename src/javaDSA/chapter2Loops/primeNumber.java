package javaDSA.chapter2Loops;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isFlag=true;
        for(int sqrt = 2 ; sqrt*sqrt<=num; sqrt++){
            if((num%sqrt)==0){
                isFlag = false;
            }
        }
        if(isFlag){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
    }


}
