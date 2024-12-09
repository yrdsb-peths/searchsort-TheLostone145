package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */

    public int hi;
    public int low;
    public int mid;
    public int[] aux;


    @Override
    public void sort(int[] arr){
        mergeSort(arr);

    }


    public static void mergeSort(int[] a) 
    { 
        int[] aux = new int[a.length];
        mergeSort(a, aux, 0, a.length - 1);
            }
        
            private static void mergeSort(int[] a, int[] aux, int lo, int hi) 
    {
        // Array is sorted if lo is greater than hi
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;         //index of middle element
        mergeSort(a, aux, lo, mid);      //Sort left side of array
        mergeSort(a, aux, mid + 1, hi);  //Sort right side of array
        merge(a, aux, lo, mid, hi);      //Combine both halves
        
            } 
        
    static void merge(int[] a, int[] aux, int lo, int mid, int hi){
        for(int k = lo; k <= hi; k++)    // copy
            aux[k] = a[k];
        int i = lo;                      // left side index
        int j = mid + 1;                 // right side index
        for (int k = lo; k <= hi; k++) { // merge
            if (i > mid){            // left is exhausted
                a[k] = aux[j];
                j++;
            }
            else if (j > hi){             // right is exhausted
                a[k] = aux[i];
                i++;
            }
            else if (aux[j] < aux[i]) {   // right element smaller than left
                a[k] = aux[j];
                j++;
            }
            else {                        // left element smaller than right
                a[k] = aux[i];
                i++;
            }
        }

    }
   

}