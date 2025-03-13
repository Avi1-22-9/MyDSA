//mutability of Array 
//Strings are immutable
import java.util.*;

public class passingArrToFun {
    public static void main(String[] args) {
        int[] num = {1 ,2, 3, 4, 5};
        System.out.print(Arrays.toString(num));
        change(num);
        System.out.print(Arrays.toString(num));


        
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
