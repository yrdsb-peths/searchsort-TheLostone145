package searchsort;

/**
 * Abstract class for search algorithms.
 */
public abstract class Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    abstract public int find(int[] arr, int target){

    /**
     * Recursively find the index of the target element in the sorted array arr
     * using binary. Return -1 if target is not found in arr.
     */
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    abstract public int recursiveFind(int[] arr, int target);

    /**
     * Return the time taken to execute a search operation.
     */
    protected long timedFind(int[] arr, int target) {
        long startTime = System.nanoTime();
        find(arr, target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
