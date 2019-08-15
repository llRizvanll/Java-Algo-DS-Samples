package algos.searching;

import java.util.Arrays;

/**
 * Binary search works only on a sorted set of elements. To use binary search on a collection, the collection must first be sorted.
 *
 * When binary search is used to perform operations on a sorted set,
 * the number of iterations can always be reduced on the basis of the value that is being searched.
 * Time Complexity is OlogN
 */
public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {1,3,4,56,56,3,2,4};
        //Arrays.sort(arr);
        System.out.println(findKeyByBinarySearch(arr,3));
    }


    private static int findKeyByBinarySearch(int[] array , int keyElement){
        int low = 0 , high = array.length ;

        while (low < high){
            int mid = (low+high)/2;
            if (array[mid] > keyElement){
                high = mid-1;
            }
            else if (array[mid] < keyElement){
                low = mid+1;
            }
            else
                return mid;
        }

        return -1;
    }
}
