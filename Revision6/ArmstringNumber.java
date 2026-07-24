package Revison6;
import java.util.Scanner;
public class ArmstringNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int rev = n;
        while(n>0){
            int digit  = n % 10;
             sum += digit * digit * digit;
             n /= 10;
        }
        if(rev==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
