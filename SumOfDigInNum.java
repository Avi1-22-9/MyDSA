import java.util.Scanner;

public class SumOfDigInNum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        int sum=0;

        while(a>0)
        {
            int r = a%10;
            sum+=r;
            a=a/10;



        }
        System.out.println(sum);



    }
}