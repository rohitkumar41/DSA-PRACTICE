package Revision5;
import java.util.Scanner;
public class PowerOfNUmber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        int result = 1;
        for(int i = 1; i<=pow; i++){
            result *= n;
        }
        System.out.println(result);
    }
}
