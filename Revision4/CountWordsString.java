package Revision4;

public class CountWordsString {
    static void main(String[] args) {
        String str = "I Love My India";
        String result = "";
        int count = 1;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
