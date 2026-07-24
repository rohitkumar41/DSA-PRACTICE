package Revision5;
import java.util.Scanner;
public class PallindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = n;
        int rev = 0;
        while(n>0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(rev == digit){
            System.out.println("Pallindrome Number");
        }else{
            System.out.println("Not Pallindrome Number");
        }
    }
}
