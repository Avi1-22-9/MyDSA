
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = in.nextInt();
        int i=2;
        while(i*i < n){
            if(n%i==0){
                System.out.println("not prime");
                return;
            }
            i=i+1;
            
            
        }
        if(i*i > n){
            System.out.println("prime");
        }
    }
}
        