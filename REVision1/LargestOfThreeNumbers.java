package Revision1;
import java.util.Scanner;
public class LargestOfThreeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(b>c){
                System.out.println("a is the largest number");
            }else{
                System.out.println("c is the largest number");
            }
        }else if(b>c){
            if(c>a){
                System.out.println("b is the largest one");
            }else{
                System.out.println("a is the largest one");
            }
        }else{
            System.out.println("c is the largest one");
        }

    }
}
