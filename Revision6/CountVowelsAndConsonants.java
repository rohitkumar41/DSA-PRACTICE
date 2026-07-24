package Revison6;
import java.util.Scanner;
public class CountVowelsAndConsonants {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vow = 0;
        int con = 0;
        for(int i = 0; i<str.length(); i++){
            if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')){
                vow++;
            }else{
                con++;
            }
        }
        System.out.println("Vowels: "+ vow);
        System.out.println("Consonants: "+ con);

    }
}
