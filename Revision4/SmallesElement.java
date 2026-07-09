package Revision4;

public class SmallesElement {
    static void main(String[] args) {
        int[] arr = {10,20,30,5,6};
        int small = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
