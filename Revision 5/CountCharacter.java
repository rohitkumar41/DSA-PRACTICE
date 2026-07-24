package Revision5;
import java.util.Scanner;
public class CountCharacter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            count++;
        }
        System.out.println(count);

    }
}
