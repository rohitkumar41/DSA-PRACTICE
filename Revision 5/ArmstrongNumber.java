package Revision5;
import java.util.Scanner;
public class ArmstrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int digit = 0;
        int temp = n;
        while(n>0){
            digit = n%10;
            sum +=  digit * digit * digit;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }

    }
}
