import java.util.Arrays;

public class twoDarray_sorted_binary
{
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        int[] arr2=BinarySearch(arr,1);
        System.out.println(Arrays.toString(arr2));
    }
    // return the index: greatest number <= target
    static int floor(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid][0]) {
                end = mid - 1;
            } else if (target > arr[mid][0]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
    // normal Binary search
    static int[] BinarySearch(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int row=floor(arr,target);
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[row][mid]) {
                end = mid - 1;
            } else if (target > arr[row][mid]) {
                start = mid + 1;
            } else {
                // ans found
                return new int[]{floor(arr,target),mid};
            }
        }
        return new int[]{-1,-1};
    }
}

