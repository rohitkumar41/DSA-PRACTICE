package Revision5;
import java.util.Scanner;
public class CountDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
