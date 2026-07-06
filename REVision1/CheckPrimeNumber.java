import java.util.Scanner;
public class CheckPrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        if(n<=1){
            isprime = false;
        }else{
            for(int i = 1; i<=n/2; i++){
                if(n%i==0){
                    isprime = true;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}

