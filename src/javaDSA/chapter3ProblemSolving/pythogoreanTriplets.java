package javaDSA.chapter3ProblemSolving;
import java.util.Scanner;

public class pythogoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if((side1*side1 + side2*side2 == side3*side3) || (side1*side1 + side3*side3 == side2*side2) || (side2*side2 + side3*side3 == side1*side1))
            System.out.println("pythogorean triplets");
        else System.out.println("not pythogorean triplets");

    }
}
