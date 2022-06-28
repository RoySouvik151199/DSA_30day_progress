import java.util.*;
public class two_d_unsorted_linear_search
{
    public static void main(String[] args)
    {
        int[][] arr = {{10, 9, 30, 72},
                       {15, 25, 12, 45},
                       {18, 1752, 74, 49},
                       {33, 754, 93, 6}};
        System.out.println(Arrays.toString(search(arr, 18654)));
    }

    public static int[] search(int[][] matrix, int target)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1, -1};
    }
}
