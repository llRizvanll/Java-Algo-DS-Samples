package algos.searching;

public class TernarySearch {

    private static int[] arr={1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        System.out.println(findKeyPos(0,arr.length,2));
    }


    private static int findKeyPos(int l,int r, int key){

        while (l<=r){
            int mid1 = l +(r-l)/3;
            int mid2 = r - (r-l)/3;

            if (arr[mid1] == key)
                return mid1;
            if (arr[mid2] == key)
                return mid2;

            if (arr[mid1]> key)
                return findKeyPos(l,mid1-1,key);
            else if (arr[mid2] < key)
                return findKeyPos(mid2+1,r,key);
            else
                return findKeyPos(mid1+1,mid2-1,key);
        }
        return -1;

    }

}
