import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Two Numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a<b){
            int temp =a;
            a=b;
            b=temp;

        }
        for(int i=a; i<=a*b; i+=a){
            if(i%b==0 & i%a==0){
                System.out.println("The LCM is:" + i);
                break;
            }
            
        }
        for(int i=b; i>=1; i--){
            if(a%i==0 & b%i==0){
                System.out.print("The Hcf is:" + i);
                break;

            }
        }

    }
    
}
