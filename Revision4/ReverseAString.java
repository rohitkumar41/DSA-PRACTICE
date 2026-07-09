package Revision4;
import java.util.Scanner;
public class ReverseAString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Rohit Kumar";
        String rev = "";
        for(int i = str.length()-1;i>=0; i--){
            rev += str.charAt(i);

        }
        System.out.println(rev);

    }
}
