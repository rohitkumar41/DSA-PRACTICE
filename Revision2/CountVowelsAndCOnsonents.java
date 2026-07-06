package Revision2;
import java.util.Scanner;
public class CountVowelsAndCOnsonents {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch: str.toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
