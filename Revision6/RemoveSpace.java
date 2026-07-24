package Revison6;
import java.util.Scanner;
public class RemoveSpace {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)!=' '){
                rev += str.charAt(i);
            }
        }
        System.out.println(rev);
    }
}
