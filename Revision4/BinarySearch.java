package Revision4;

public class BinarySearch {
    static void main(String[] args){
        int[] arr = {10,20,30,40};
        int k = 40;
        int low = 0;
        int high = arr.length -1;

        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==k){
                System.out.print(mid);
                break;
            }else if(arr[mid]<k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }



    }
}
