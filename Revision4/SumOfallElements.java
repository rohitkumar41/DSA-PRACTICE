package Revision4;

public class SumOfallElements {
    static void main(String[] args) {
        int[] arr = {10,20,40,50};
        int sum = 0;
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            result += arr[i];
        }
        System.out.println(result);
    }
}
