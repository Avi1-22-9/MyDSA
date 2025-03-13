package SearchingAlgorithms;
import java.util.*;
import java.lang.*;


public class SearchInString {
    
    public static void main(String[] args) {
        String str ="Avinash";
        char target= 'p';
        System.out.print(Search(str, target));

    }
    static boolean Search(String str,char target){
        for(int i=0; i<str.length(); i++){
            if(target==str.charAt(i)){
                return true;

            }
        }
        return false;
    }
}
