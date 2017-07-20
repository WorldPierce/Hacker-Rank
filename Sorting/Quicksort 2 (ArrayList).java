import java.util.*;
public class Solution {
       
          static ArrayList<Integer> quickSort(ArrayList<Integer> ar) {
              //int[] ar = arr.toArray(new Integer[ar.size()]);
              if(ar.size() <=1){
                  return ar;
              }
              ArrayList<Integer> left = new ArrayList<Integer>();
              ArrayList<Integer> right = new ArrayList<Integer>();
              ArrayList<Integer> equal = new ArrayList<Integer>();
              
              //grab pivot
              int p = ar.get(0);
              equal.add(p);
              for(int i = 1; i < ar.size(); i++){
                  if(ar.get(i) < p){
                      left.add(ar.get(i));
                  }
                  else if(ar.get(i) > p){
                      right.add(ar.get(i));
                  }
                  else {
                      equal.add(ar.get(i));
                  }
              }
              ArrayList<Integer> sortedLeft = quickSort(left);
              //printArray(sortedLeft);
              ArrayList<Integer> sortedRight = quickSort(right);
              //printArray(sortedRight);
              ArrayList<Integer> sorted = new ArrayList<>();
              sorted.addAll(sortedLeft);
              sorted.addAll(equal);
              sorted.addAll(sortedRight);
              printArray(sorted);
              return sorted;
       }   
 
 static void printArray(ArrayList<Integer> ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           //int[] ar = new int[n];
           ArrayList<Integer> ar = new ArrayList<>();
           for(int i=0;i<n;i++){
              ar.add(in.nextInt()); 
           }
          //ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(ar));
           quickSort(ar);
       }    
   }