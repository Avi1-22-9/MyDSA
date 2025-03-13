import java.util.Scanner;
public class RevOfNum {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n = in.nextInt();
    int rev=0;
    while(n>0){
        int r = n%10;
        rev = rev*10+r;
        n=n/10;

    }
    System.out.println("The Reverse of a Number is :" + rev);

    
}
}
