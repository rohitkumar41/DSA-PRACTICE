package Revision4;

public class ReverseWords {
    static void main(String[] args) {
        String str = "I Love India";
        String[] words = str.split(" ");
        String rev = "";
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }

    }
}
