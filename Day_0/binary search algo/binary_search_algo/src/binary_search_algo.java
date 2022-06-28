import java.util.*;
public class binary_search_algo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter target");
        int target=sc.nextInt();
        System.out.println(binarysearch(a,target));
    }

    public static int binarysearch(int arr[],int target)
    {
        int start =0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
