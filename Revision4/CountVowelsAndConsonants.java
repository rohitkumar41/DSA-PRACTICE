package Revision4;

public class CountVowelsAndConsonants {
    static void main(String[] args) {
        String str = "Rohit Kumar";
        str = str.toLowerCase();
        int vowels = 0;
        int cons = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cons);
    }
}