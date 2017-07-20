import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void quicksort(int[] ar,int lo,int hi){
        if(lo < hi){
            int p = partition(ar,lo,hi);
            quicksort(ar, lo, p - 1);
            
            quicksort(ar, p+1, hi);
            
        }
    }
    
    public static int partition(int[] ar,int lo,int hi){
        int p = ar[hi];
        int i = lo - 1;
        for(int j = lo; j < hi; j++){
            if(ar[j] < p){
                i = i + 1;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                    
            }
        }
        if(ar[hi] < ar[i + 1]){
            int temp = ar[i+1];
            ar[i+1] = ar[hi];
            ar[hi] = temp;
        }
        printArray(ar);
        return i + 1;
    }
    
    public static void printArray(int[] ar){
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        quicksort(ar, 0, ar.length - 1);
      
    }
}