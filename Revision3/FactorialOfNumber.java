package Revision3;
import java.util.Scanner;
public class FactorialOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to generate factorail");
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        System.out.print(fact);
    }
}
