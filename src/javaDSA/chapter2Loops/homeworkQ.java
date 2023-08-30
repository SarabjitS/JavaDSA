package javaDSA.chapter2Loops;
import java.util.Scanner;
public class homeworkQ {

    public static void main(String[] args) {
        System.out.print("Question number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1: sumOfOddEven();
            break;
            case 2: digitsSmallLarge();
            break;
            case 3: exponential();
            break;
            case 4: simpleCalculator();
            break;
//            case5: alphabetLowerUpper();
//            break;
        }

    }
    public static void sumOfOddEven(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for(int i= number; i>0; i/=10){
            int digit = i%10;
            if(digit % 2 == 0){
                sumOfEven+=digit;
            }else{
                sumOfOdd+=digit;
            }

        }
        System.out.println(sumOfOdd);
        System.out.println(sumOfEven);
    }

    public static void digitsSmallLarge(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int smallestDigit = number%10;
        int largestDigit = number%10;
        number/=10;
        while(number > 0){
            int digits = number%10;
            if(digits>largestDigit){
                largestDigit = digits;
            } else if(digits<smallestDigit){
                smallestDigit=digits;
            }
            number/=10;
        }
        System.out.println("The largest digit of " + number + " is " + largestDigit);
        System.out.println("The smallest digit of " + number + " is " + smallestDigit);
    }

    public static void exponential(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int exponential = 1;
        for(int i = 0; i<b; i++){
            exponential *=a ;
        }
        System.out.println(exponential);
    }

    public static void simpleCalculator(){
        Scanner sc = new Scanner(System.in);

        char input;
        do  {
            System.out.println("Enter the first number");
            int number1 = sc.nextInt();
            System.out.println("Enter the second number");
            int number2 = sc.nextInt();
            System.out.println("Enter the operation");
            char sign = sc.next().charAt(0);

            switch (sign) {
                case '+' -> System.out.println("The sum of two numbers is " + (number1 + number2));
                case '-' -> System.out.println("The difference of two numbers is " + (number1 - number2));
                case '/' -> System.out.println("The quotient of two numbers is " + (number1 / number2));
                case '*' -> System.out.println("The product of two numbers is " + (number1 * number2));
                case '%' -> System.out.println("The remainder of two numbers is " + (number1 * number2));
            }
            System.out.println("Do you want to continue");
            input = sc.next().charAt(0);

        }while((input != 'x') && (input != 'X'));
    }
}
