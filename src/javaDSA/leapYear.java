package javaDSA;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       if(num % 4 == 0 || num%400 == 0)
       {
           if (num % 100 == 0)
           {
               System.out.println("It is not a leap year");
           }
           else{
               System.out.println("leap");
           }
       }


    }
}