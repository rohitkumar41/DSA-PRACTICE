package Revision2;
import java.util.Scanner;
public class ArmstrongNUmber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while(n!=0){
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if(temp == sum){
            System.out.println("armstrong number");
        }else{
            System.out.println("Not armstrong number");
        }
    }
}
