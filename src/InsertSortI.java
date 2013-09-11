/*
 * Insertion Sort - Part 1

https://www.hackerrank.com/challenges/insertionsort1


 */

public class InsertSortI {
    static void insertionSort(int[] ar) {
        int length = ar.length;
        int end = ar[length - 1];
        for (int i = length-1; i >= 0; i--) {
            if (i > 0 && ar[i-1] > end)
                ar[i] = ar[i-1];
            else {
                ar[i] = end;
            }
          
            printArray(ar);
            if (ar[i] <= end)
                break;
            
        }
    }   

    /* Tail starts here */

    static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
   public static void main(String[] args) {
        int[] ar = {2, 4, 6, 8, 3};
        insertionSort(ar);
    }    

}
