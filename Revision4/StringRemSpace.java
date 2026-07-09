package Revision4;

public class StringRemSpace {
    static void main(String[] args) {
        String str = "I Love My India";
        String result = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
