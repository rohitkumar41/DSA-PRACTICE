package Revision4;

public class MoveZeroToENd {
    static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4};

        int index = 0;

        // Move all non-zero elements to the front
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        // Print the array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}