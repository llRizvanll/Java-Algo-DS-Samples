package algos.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,55,223,112,3,22,1};
        selection_sort(arr);
    }

    private static void selection_sort(int[] arr){
        int n = arr.length , min;

        for (int i = 0; i < n; i++) {
            min = i;
            //ith position is sorted so put j = i+1;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i : arr) { System.out.println(i); }
    }

}
