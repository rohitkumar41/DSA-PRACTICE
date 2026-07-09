package Revision4;
import java.util.Scanner;
public class PallindromeString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "madam";
        String rev = "";
        String temp = str;
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(rev.equals(temp)){
            System.out.println("Pallindrome NUmber");
        }else{
            System.out.println("Not Pallindrone Number");
        }
    }
}
