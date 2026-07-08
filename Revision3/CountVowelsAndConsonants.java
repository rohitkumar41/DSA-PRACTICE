package Revision3;
import java.util.Scanner;
public class CountVowelsAndConsonants {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("COnsonants: "+ consonants);
    }
}
