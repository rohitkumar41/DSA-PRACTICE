package Revision3;
import java.util.Scanner;
public class CheckEvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even orodd");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
