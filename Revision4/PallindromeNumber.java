package Revision4;
import java.util.Scanner;
public class PallindromeNumber {
    static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       int n = Sc.nextInt();
       int rev = 0;
       int temp = n;
       while(n>0){
           rev = rev * 10 + n % 10;
           n /= 10;
       }
       if(temp==rev){
           System.out.println("Pallindrome Number");
       }else{
           System.out.println("Not Pallindrome Number");
       }
    }
}
