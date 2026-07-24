package Revison6;
import java.util.Scanner;
public class pallindromestring {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = str;
        String rev = "";
        for(int i = str.length() - 1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(temp.equals(rev)){
            System.out.println("Pallindrome Number");
        }else{
            System.out.println("Not Pallindrome ");
        }
    }
}
