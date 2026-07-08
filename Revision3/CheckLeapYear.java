package Revision3;
import java.util.Scanner;
public class CheckLeapYear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n%4==0 & n%100 != 0) || (n%400==0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}
