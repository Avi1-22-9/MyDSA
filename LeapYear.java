import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int n =in.nextInt();
        if(n%4==0 && n%100!=0 || n%400==0){
            System.out.println("The Year" + n + " is a leap Year");

        }
        else{
            System.out.println("The Year " + n + " is NOT a Leap Year!");
        }
    }
}
