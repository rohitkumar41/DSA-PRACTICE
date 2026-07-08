package Revision3;
import java.util.Scanner;
public class ReverseANumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while(n!=0){
            rev = rev*10+n%10;
            n /= 10;

        }
        System.out.println(rev);
    }
}
