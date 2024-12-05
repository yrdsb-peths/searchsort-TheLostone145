package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        return recursiveFindHelper(arr, target, 0);
    }
    private int recursiveFindHelper(int[] arr, int target, int index){
        if(index>=arr.length) return -1;
        if(arr[index]==target){
            return index;
        }
        return recursiveFindHelper(arr,target,index+1);
    }

}
