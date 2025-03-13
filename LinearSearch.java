package SearchingAlgorithms;
import java.util.*;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {22,44,77, 54,-9,8,3};
        int target=-9;
        System.out.println(Search(arr,target));
        int x=Search1(arr, target);
        if(x>=0){
        System.out.print("The Target found at Index of "+ x);
        }
        else{
            System.out.print("The Target NOT Found!");
        }


        
    }
    static boolean Search(int[] arr, int target){
        for(int i : arr){
            if(target==i){
                return true;
            }
        }
        return false;
    }
    static int Search1(int[] arr, int target){
        for(int i=0; i<=arr.length; i++){
            if(arr[i]==target){
                //System.out.print(i);
                return i;
            }
        }
        return -1;
    }
}
