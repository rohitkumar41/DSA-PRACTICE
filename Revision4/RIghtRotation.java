package Revision4;

public class RIghtRotation {
    static void main(String[] ars) {
        int[] arr = {10,20,30,40,50};
        int temp = arr[arr.length - 1];
        for(int i = arr.length - 1 ; i> 0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = temp;

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
