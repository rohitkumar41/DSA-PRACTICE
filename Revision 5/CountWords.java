package Revision5;
import java.util.Scanner;
public class CountWords {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        for(int i = 0; i<str.length()-1;i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
