package Revision2;
import java.util.Scanner;
public class LargestOfThreeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("a is the largest one");
        } else if (b >= a && b >= c) {
            System.out.println("b is the largest one");
        } else {
            System.out.println("c is the largest one");
        }
    }
}
