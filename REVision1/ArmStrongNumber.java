package Revision1;
import java.util.Scanner;
public class ArmStrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += digit*digit*digit;
            n /= 10;
        }
        if(sum == temp){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
