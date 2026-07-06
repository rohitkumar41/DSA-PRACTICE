package Revision2;
import java.util.Scanner;
public class RemoveDuplicatesFromString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(char ch: str.toCharArray()){
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println(result);
    }
}
