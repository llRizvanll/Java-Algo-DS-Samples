package algos.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,4,5,2,5,1,7,83,23,556,34,2,6,3,22,31,1};
        bubble_sort(arr);
    }

    private static void bubble_sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int k = 0; k < n-i-1; k++) {
                if (arr[k] > arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] =  temp;
                }
            }
        }

        for (int i : arr) { System.out.println(arr[i]); }
    }
}
