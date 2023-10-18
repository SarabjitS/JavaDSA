package javaDSA.chapter3ProblemSolving;
import java.util.Scanner;
public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 2; i*i <=number; i++){
            while ((number % i) == 0) {
                System.out.println(i);
                number = number / i;
                }
        }
        if(number>1){
            System.out.println(number);
        }
    }
}


