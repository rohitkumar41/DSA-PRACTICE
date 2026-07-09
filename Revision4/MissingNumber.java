package Revision4;

public class MissingNumber {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int n = arr.length;
        int actual_sum = 0;
        int expected_sum = n*(n+1)/2;
        for(int i = 0; i<arr.length-1; i++){
            actual_sum += arr[i];
        }

        int missing = expected_sum - actual_sum;
        System.out.println(missing);

    }
}
