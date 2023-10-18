package javaDSA.chapter3ProblemSolving;
import java.util.Scanner;
public class rotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nod = 0;
        int newN;
        int temp = n;
        int mult = 1;
        int div =1;

        //Calculate number of digits
        while(temp>0){
            temp = temp/10;
             nod++;
        }
        //Where k>nod
        k = k % nod;
        //Where k<nod
        if(k<0){
            k += nod;
        }
        //calculate mult and div
        for(int i = 1; i<=nod; i++){
            if(k>=i){
                div *= 10;
            }else{
                mult *= 10;
            }
        }
        int rem = n%div;
        int q = n/div;
        newN = rem*mult + q;
        System.out.println(newN);
    }
}
