package Revision4;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {20,30,40,50};
        int k = 40;
        int index = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("not in the range ");
        }
    }
}
