package Revision4;
import java.util.Arrays;
public class Anagram {
    static void main() {
        String s1 = "rohit";
        String s2 = "tihor";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // conver them into charracter aaya
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
