package Revision3;
import java.util.Scanner;
public class CheckPrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether the number is prime orn not");
        int n = sc.nextInt();
        boolean isprime = true;
        if(n<=1){
            isprime = false;
        }else{
            for(int i=2; i<=n/2;i++){
                isprime =false;
                break;
            }
        }
        if(isprime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime NUmber");
        }
    }
}
